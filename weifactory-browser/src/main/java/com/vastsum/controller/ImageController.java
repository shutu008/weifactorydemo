package com.vastsum.controller;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.Image;
import com.vastsum.entity.vo.ImageVO;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.service.ImageServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ssj
 * @create 2017-11-11 13:14
 */
@RestController
@RequestMapping(value = "/image")
@Api(value = "/image",tags = {"图片管理"})
public class ImageController extends BaseController {

    @Autowired
    private ImageServer imageServer;

    @PostMapping(value = "/list")
    @ApiOperation(value = "根据条件查询图片(所有用户公用一个接口)@20171111")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", value = "用户ID", required = true),
            @ApiImplicitParam(paramType = "query", name = "sn", value = "设备序列号", required = false),
            @ApiImplicitParam(paramType = "query", name = "sensorType", value = "传感器标识", required = false),
            @ApiImplicitParam(paramType = "query", name = "startTime", value = "开始时间", required = false),
            @ApiImplicitParam(paramType = "query", name = "endTime", value = "结束时间", required = false),
            @ApiImplicitParam(paramType = "query", name = "page", value = "页码", required = true),
            @ApiImplicitParam(paramType = "query", name = "pageSize", value = "行数", required = true)

    })
    public ResponseEntity<ResultModel> listImages(@ModelAttribute ImageVO imageVO){
        if (imageVO == null){
            return  ResponseEntity.ok(ResultModel.error(ResultStatus.IMAGE_NOT_NULL));
        }
        if (imageVO.getUserId() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        PageInfo<Image> imagePageInfo = imageServer.pageImage(imageVO);
        return ResponseEntity.ok(ResultModel.ok(imagePageInfo));
    }


}
