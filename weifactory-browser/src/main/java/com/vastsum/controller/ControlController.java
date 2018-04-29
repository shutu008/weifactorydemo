package com.vastsum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.BizControl;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.BatchService;
import com.vastsum.service.BizControlService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author ssj
 * @create 2017-11-18 11:13
 */
@RestController
@RequestMapping("/control")
@Api(value="/control",tags = {"远程控制管理"})
public class ControlController extends BaseController {
    @Autowired
    private BizControlService bizControlService; //控制管理

    @Autowired
    private BatchService batchService;
    

    @RequestMapping(value = "/list/{sn}",method = RequestMethod.GET)
    @ApiOperation(value = "根据设备序列号，获取对应所有的开关@20171118")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "sn",value = "设备序列号",required = true)
    })
    public ResponseEntity<ResultModel> list(@PathVariable String sn){
        List<BizControl> bizControls = bizControlService.listBySn(sn);
        return ResponseEntity.ok(ResultModel.ok(bizControls));
    }
    
    //设备托管给服务器
    @GetMapping(value = "/trust/{batchId}")
    @ApiOperation(value = "设备托管给服务器@20180330")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id",required = true)
    })
    public ResponseEntity<ResultModel> trustStatus(@PathVariable Long batchId){

    	int i = batchService.updateTrustStatusByDeviceId(batchId);
    	
    	return V.ok(i);
    }
    
    
    
}
