package com.vastsum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.Seed;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.SeedService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 育苗室管理
* @author shensj 
* @date 2018年3月14日 下午9:47:01
 */
@RestController
@RequestMapping(value = "/seed")
@Api(value = "/seed",tags={"育苗室管理"})
public class SeedController extends BaseController {

	@Autowired
	private SeedService seedService;
	
	//添加育苗室
	@PostMapping("/save")
	@ApiOperation(value = "添加育苗室@2018-03-14")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "batchId",value = "批次id",required = true),
            @ApiImplicitParam(paramType = "query",name = "seedRoomPlant",value = "育苗室植物",required = true),
            @ApiImplicitParam(paramType = "query",name = "seedPlantingTime",value = "播种时间",required = true),
            @ApiImplicitParam(paramType = "query",name = "seedRecoveryTime",value = "预计可移植日期",required = true)
    })
    public  ResponseEntity<ResultModel> save(@ModelAttribute Seed seed){
		if (seed == null) {
			return V.error("育苗室信息不能为空");
		}
		if (seed.getBatchId() == null) {
			return V.error("批次号不能为空");
		}
		if (seed.getSeedRoomPlant() == null) {
			return V.error("育苗室植物名称");
		}
		if (seed.getSeedPlantingTime() == null) {
			return V.error("播种日期不能为空");
		}
		if (seed.getSeedRecoveryTime() == null) {
			return V.error("预计可移植日期不能为空");
		}
		seedService.add(seed);
		return V.ok();
    }
	
	//获取最新的育苗室信息
	@GetMapping("/last/{batchId}")
	@ApiOperation(value = "根据批次id获取最新的育苗信息@2018-03-14")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id——eg:6",required = true)
    })
    public ResponseEntity<ResultModel> getLastSeed( @PathVariable Long batchId){
        if (batchId == null) {
            return V.error("批次id不能等于空");
        }
       Seed seed = seedService.getLastByBatchId(batchId);
       return V.ok(seed);
    }

	//根据育苗室id查看育苗室详情
	@GetMapping("/{seedId}")
	@ApiOperation(value = "根据育苗室id获取育苗信息@2018-03-14")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "seedId",value = "育苗室id——eg:6",required = true)
    })
    public ResponseEntity<ResultModel> getSeed( @PathVariable Long seedId){
        if (seedId == null) {
            return V.error("育苗室id不能等于空");
        }
       Seed seed = seedService.getById(seedId);
       return V.ok(seed);
    }

	//根据批次id获取育苗室列表
	@GetMapping("/{batchId}/{page}/{pageSize}")
	@ApiOperation(value = "根据批次id获取育苗室列表@2018-03-14")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id——eg:6",required = true),
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> getSeedList(  @PathVariable Long batchId,
										    		 @PathVariable Integer page,
										             @PathVariable Integer pageSize){
        if (batchId == null) {
            return V.error("批次id不能等于空");
        }
        if (page == null) {
			page = 1;
		}
        if (pageSize == null) {
			page = 10;
		}
       PageInfo<Seed> pageSeed = seedService.pageBybatchId(batchId, page, pageSize);
       return V.ok(pageSeed);
    }
	
	//废弃当前育苗室信息
	@PostMapping("/abandon")
	@ApiOperation(value = "根据育苗室id废弃当前育苗室信息@2018-03-14")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "seedId",value = "育苗室id——eg:6",required = true)
    })
    public ResponseEntity<ResultModel> abandon(Long seedId){
        if (seedId == null) {
            return V.error("育苗室id不能等于空");
        }
       seedService.abandonSeed(seedId);
       return V.ok();
    }
	
	
	
}
