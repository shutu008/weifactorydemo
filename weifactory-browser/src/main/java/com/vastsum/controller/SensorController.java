package com.vastsum.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.Sensor;
import com.vastsum.entity.SensorCollection;
import com.vastsum.enums.ResultStatus;
import com.vastsum.enums.SensorEnum;
import com.vastsum.model.ResultModel;
import com.vastsum.service.SensorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author ssj
 * @create 2017-09-16 15:01
 */
@RestController
@RequestMapping("/history")
@Api(value="/history",tags = {"历史数据管理"})
public class SensorController extends BaseController {


    @Autowired
    private SensorService sensorService;


    @RequestMapping(value = "/sensor", method = RequestMethod.POST)
    @ApiOperation(value = "根据条件获取传感器采集的历史数据@2017-09-16")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "deviceId",value = "设备id——eg:6",required = true),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "开始时间——eg:2017-09-15 20:20:20",required = false),
            @ApiImplicitParam(paramType = "query",name = "endTime",value = "结束时间——eg:2017-09-17 20:20:20",required = false),
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> userList(Integer deviceId, Date startTime, Date endTime, Integer page, Integer pageSize){
       if (deviceId == null){
           return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
       }
        PageInfo<Sensor> sensorPageInfo = sensorService.selectSensorsBydeviceId(deviceId, startTime, endTime, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(sensorPageInfo));
    }


    @RequestMapping(value = "/sensor/temperature/{deviceId}", method = RequestMethod.GET)
    @ApiOperation(value = "根据设备id获取最新的温度信息@2017-09-16")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id——eg:6",required = true)
    })
    public ResponseEntity<ResultModel> getTemperature( @PathVariable Integer deviceId){
        if (deviceId == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        Sensor sensor = sensorService.selectLastSensorBydeviceId(deviceId);
        //封装结果
        Map<String ,String> map = new HashMap<>();
        if (sensor != null){
            double data = sensor.getSensorTemperature1();
            map.put("data",String.valueOf(data));
            map.put("name","temperature");
            return ResponseEntity.ok(ResultModel.ok(map));
        }else {
            map.put("data","");
            map.put("name","temperature");
            return ResponseEntity.ok(ResultModel.ok(map));
        }
    }

    @RequestMapping(value = "/sensorCollection/temperature/{sn}", method = RequestMethod.GET)
    @ApiOperation(value = "根据设备id获取最新的温度信息@2017-10-15")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "sn",value = "设备id——eg:ZWGC2017100800004",required = true)
    })
    public ResponseEntity<ResultModel> getTemperature( @PathVariable String sn){
        if (sn == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
        }
        SensorCollection sensorCollection = sensorService
                .getLastSensorCollectionBySnAndSensor(sn, SensorEnum.SENSOR_TEMPERATURE_1.getIndex());
        //封装结果
        Map<String ,String> map = new HashMap<>();
        if (sensorCollection != null){
            String data = sensorCollection.getData();
            map.put("data",data);
            map.put("name","temperature");
            return ResponseEntity.ok(ResultModel.ok(map));
        }else {
            map.put("data","");
            map.put("name","temperature");
            return ResponseEntity.ok(ResultModel.ok(map));
        }
    }

    @RequestMapping(value = "/sensor/humidity/{deviceId}", method = RequestMethod.GET)
    @ApiOperation(value = "根据设备id获取最新的湿度信息@2017-09-16")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id——eg:6",required = true)
    })
    public ResponseEntity<ResultModel> getHumidity( @PathVariable Integer deviceId){
        if (deviceId == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        Sensor sensor = sensorService.selectLastSensorBydeviceId(deviceId);
        //封装结果
        Map<String ,String> map = new HashMap<>();
        if (sensor != null){
            double data = sensor.getSensorHumidity1();
            map.put("data",String.valueOf(data));
            map.put("name","humidity");
            return ResponseEntity.ok(ResultModel.ok(map));
        }else {
            map.put("data","");
            map.put("name","humidity");
            return ResponseEntity.ok(ResultModel.ok(map));
        }
    }

    @RequestMapping(value = "/sensorCollection/humidity/{sn}", method = RequestMethod.GET)
    @ApiOperation(value = "根据设备序列号获取最新的湿度信息@2017-10-15")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "sn",value = "设备id——eg:ZWGC2017100800004",required = true)
    })
    public ResponseEntity<ResultModel> getHumidity( @PathVariable String sn){
        if (sn == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
        }
        SensorCollection sensorCollection = sensorService
                .getLastSensorCollectionBySnAndSensor(sn, SensorEnum.SENSOR_HUMIDITY_1.getIndex());
        //封装结果
        Map<String ,String> map = new HashMap<>();
        if (sensorCollection != null){
            String data = sensorCollection.getData();
            map.put("data",data);
            map.put("name","humidity");
            return ResponseEntity.ok(ResultModel.ok(map));
        }else {
            map.put("data","");
            map.put("name","humidity");
            return ResponseEntity.ok(ResultModel.ok(map));
        }
    }


    //根据设备序列号返回临时采集的信息
    @PostMapping(value = "/sensorCollection")
    @ApiOperation(value = "根据设备序列号，获取临时采集表中的数据@20171011")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号"),
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> getsensorCollectionBySn(String sn, Integer page,Integer pageSize){
        if (sn == null || "".equals(sn)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
        }
        PageInfo<SensorCollection> sensorCollectionPageInfo = sensorService.listSensorCollectionBySn(sn, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(sensorCollectionPageInfo));
    }
}
