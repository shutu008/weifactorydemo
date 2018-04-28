package com.vastsum.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/mqtt")
@Api(value = "/mqtt",tags={"mqtt通信"})
public class MqttController {


    @PostMapping(value="/add")
    @ApiOperation(value="添加topic")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号", required = true),
            @ApiImplicitParam(paramType = "query",name = "deviceType",value = "设备规格",required = false),
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户id",required = false),
            @ApiImplicitParam(paramType = "query",name = "note",value = "备注信息",required = false)
    })
    public ResponseEntity<ResultModel> add(
            @RequestParam(value = "sn",required = true)String sn,
            @RequestParam(value = "deviceType",required = false)String deviceType,
            @RequestParam(value = "userId",required = false)Integer userId,
            @RequestParam(value = "note",required = false)String note
    ){
  
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ADD_FAILED));
    }

    //根据设备id获取所有的批次信息
    @GetMapping(value = "/{deviceId}/{page}/{pageSize}")
    @ApiOperation(value = "根据设备id获取历史上所有的批次信息@20180326")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id",required = true),
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> batchList(@PathVariable Integer deviceId,
                                                 @PathVariable Integer page,
                                                 @PathVariable Integer pageSize){
        if (deviceId == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        return V.ok(null);
    }
    
    //添加topic
    //列出所有的topic
    //指定topic 发布消息
    
}
