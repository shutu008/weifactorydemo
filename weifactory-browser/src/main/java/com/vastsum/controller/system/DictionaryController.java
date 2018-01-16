package com.vastsum.controller.system;

import com.vastsum.entity.SysDict;
import com.vastsum.entity.SysDictItem;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.service.DictService;
import com.vastsum.utils.DictUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ssj
 * @create 2017-07-29 16:13
 */
@RequestMapping("/dict")
@RestController
@Api(value = "/dict",tags={"系统字典管理"})
public class DictionaryController extends BaseController {

    @Autowired
    private DictService dictService;

    @GetMapping(value = "/list")
    @ApiOperation(value = "获取所有字典的列表@20171024")
    public ResponseEntity<ResultModel> listDict(){
        //false列出所有的菜单，包括状态为0
        List<SysDict> sysDictPageInfo = dictService.listSysDict("0");
        return ResponseEntity.ok(ResultModel.ok(sysDictPageInfo));
    }

    @GetMapping(value = "/list/controlModel")
    @ApiOperation(value = "列出控制模式@20171126")
    public ResponseEntity<ResultModel> listDictItemBycontrolModel(){
        List<SysDictItem> sysDictItems = dictService.listSysDictItemNoPage("controlModel");
        return ResponseEntity.ok(ResultModel.ok(sysDictItems));
    }


    @PostMapping(value = "/saveOrUpdate")
    @ApiOperation(value = "保存或修改字典@20171029")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "code",value = "字典code",required = true),
            @ApiImplicitParam(paramType = "query",name = "name",value = "字典name",required = true),
            @ApiImplicitParam(paramType = "query",name = "status",value = "字典状态",required = false),
            @ApiImplicitParam(paramType = "query",name = "discription",value = "字典描述",required = false),
            @ApiImplicitParam(paramType = "query",name = "orderNumber",value = "字典序号",required = false),
    })
    public ResponseEntity<ResultModel> saveOrUpdate(@ModelAttribute SysDict sysDict){
        if(sysDict == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_NULL));
        }
        if (sysDict.getCode() == null){
            return  ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_CODE_NULL));
        }
        if (sysDict.getName() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_NAME_NULL));
        }
        //查看表中有没有对应code的字典
        SysDict sysDictByCode = dictService.getSysDictByCode(sysDict.getCode());
        if (sysDictByCode !=null){
            //字典中有对应的code，更新操作
            Integer update = dictService.update(sysDict);
            if (update >0){
                //更新字典缓存
                DictUtil.loadCache();
                return ResponseEntity.ok(ResultModel.ok());
            }
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
        }
        //字典中code没有对应的字典
        Integer save = dictService.save(sysDict);
        if (save >0){
            //更新字典缓存
            DictUtil.loadCache();
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));

    }

    @GetMapping(value = "/dictItemList/{code:.+}")
    @ApiOperation(value = "根据字典CODE获取字典项列表@20171029")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "code",value = "字典code",required = true)
    })
    public ResponseEntity<ResultModel> listDictItemByCode(@PathVariable String code){
        if (code == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_CODE_NULL));
        }
        List<SysDictItem> sysDictItemPageInfo = dictService.listSysDictItemByCode(code);
        return ResponseEntity.ok(ResultModel.ok(sysDictItemPageInfo));
    }


    @PostMapping(value = "/dictItem/saveOrUpdate")
    @ApiOperation(value = "保存或修改字典项@20171029")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "dictCode",value = "字典code",required = true),
            @ApiImplicitParam(paramType = "query",name = "itemCode",value = "字典项code",required = true),
            @ApiImplicitParam(paramType = "query",name = "itemName",value = "字典项name",required = true),
            @ApiImplicitParam(paramType = "query",name = "status",value = "字典状态",required = false),
            @ApiImplicitParam(paramType = "query",name = "discription",value = "字典描述",required = false),
            @ApiImplicitParam(paramType = "query",name = "orderNumber",value = "字典序号",required = false),
    })
    public ResponseEntity<ResultModel> saveOrUpdateDictItem(@ModelAttribute SysDictItem sysDictItem){
        if(sysDictItem == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_ITEM_NULL));
        }
        if (sysDictItem.getDictCode() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_CODE_NULL));
        }
        if (sysDictItem.getItemCode() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_ITEM_CODE_NULL));
        }
        if (sysDictItem.getItemName()== null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_ITEM_NAME_NULL));
        }
        //根据code，判断字典表中有没有字典，如果没有，则添加字典，并不能直接添加字典项
        SysDict sysDictByCode = dictService.getSysDictByCode(sysDictItem.getDictCode());
        if (sysDictByCode == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DICT_NULL));
        }
        //判断字典中有没有dictItem
        SysDictItem sysDictItem1 = dictService.getSysDictItemByCodeAndItemCode(sysDictItem.getDictCode(), sysDictItem.getItemCode());
        if (sysDictItem1 == null){
            Integer save = dictService.saveDictItem(sysDictItem);
            if (save >0){
                //更新字典缓存
                DictUtil.loadCache();
                return ResponseEntity.ok(ResultModel.ok());
            }
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.ERROR), HttpStatus.SERVICE_UNAVAILABLE);
        }
        Integer update = dictService.updateDictItem(sysDictItem.getDictCode(),sysDictItem);
        if (update >0){
            //更新字典缓存
            DictUtil.loadCache();
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
    }


}
