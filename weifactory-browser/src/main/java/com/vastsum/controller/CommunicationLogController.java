package com.vastsum.controller;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.CommunicationLog;
import com.vastsum.service.ConnectService;
import com.vastsum.entity.vo.CommLogVO;
import com.vastsum.model.ResultModel;
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
 * @create 2017-11-19 13:43
 */
@RestController
@RequestMapping(value = "/comm")
@Api(value = "/comm",tags = {"通信记录管理"})
public class CommunicationLogController extends BaseController {

    @Autowired
    private ConnectService connectService;

    @PostMapping(value = "/list")
    @ApiOperation(value = "获取连接信息列表@20171119")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = false),
            @ApiImplicitParam(paramType = "query",name = "serverPort",value = "服务器端口号",required = false),
            @ApiImplicitParam(paramType = "query",name = "optionType",value = "操作类型",required = false),
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "行数",required = true)
    })
    public ResponseEntity<ResultModel> list(String sn,
                                            Integer serverPort,
                                            Integer optionType,
                                            Integer page,
                                            Integer pageSize){

        CommunicationLog communicationLog = new CommunicationLog();
        communicationLog.setSn(sn);
        communicationLog.setServerPort(serverPort);
        communicationLog.setOptionType(optionType);
        PageInfo<CommLogVO> commLogVOPageInfo = connectService.pageByCommunicationLog(communicationLog, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(commLogVOPageInfo));
    }
}
