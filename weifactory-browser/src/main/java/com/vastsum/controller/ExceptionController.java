package com.vastsum.controller;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.BizException;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.service.BizExceptionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ssj
 * @create 2017-11-18 17:48
 */
@RestController
@RequestMapping("/exception")
@Api(value="/exception",tags = {"异常预警"})
public class ExceptionController extends BaseController {

    @Autowired
    private BizExceptionService bizExceptionService;

    @PostMapping(value = "/list")
    @ApiOperation(value = "根据条件查询出相关异常信息（所有用户公用一个接口）@20171118")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "当前登陆用户id",required = true),
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = false),
            @ApiImplicitParam(paramType = "query",name = "exceptionType",value = "异常类型（下拉框）",required = false),
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "条数",required = true)
    })
    public ResponseEntity<ResultModel> exceptionList(BizException bizException, Integer page, Integer pageSize){
        if (bizException == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXCEPTION_NULL));
        }
        if (bizException.getUserId() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        PageInfo<BizException> bizExceptionPageInfo = bizExceptionService.pageByBizException(bizException, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(bizExceptionPageInfo));
    }
}
