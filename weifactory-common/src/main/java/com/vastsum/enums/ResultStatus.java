package com.vastsum.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;

/**
 * 自定义响应码
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@ApiModel
public enum ResultStatus {
    //common
    SUCCESS(1000, "成功"),
    FAILED(1005,"失败"),
    ERROR(1006,"错误"),
    PARAM_NULL(1007,"空参数"),
    ENABLED_NUMBER(1008,"请填写有效数据"),
    //User
    USER_ADD_SUCCESS(110,"用户添加成功"),
    USER_ADD_FAILED(115,"用户添加失败"),
    USERNAME_EXIST(116,"用户名已存在"),
    USER_DELETE_SUCCESS(120,"用户删除成功"),
    USER_DELETE_FAILED(125,"用户删除失败"),
    USER_LOGIN_SUCCESS(130,"用户登陆成功"),
    USER_LOGIN_FAILED(135,"用户登陆失败"),
    USER_REGISTER_SUCCESS(140,"用户注册成功"),
    USER_REGISTER_FAILED(145,"用户注册失败"),
    USER_LIST_SUCCESS(150,"用户列表查询成功"),
    USER_LIST_FAILED(155,"用户列表查询失败"),
    USER_EXIST(160,"用户已存在"),
    USERNAME_ERROR(165, "用户名错误"),
    PASSWORD_ERROR(166,"密码错误"),
    USER_NOT_FOUND(167, "用户不存在"),
    USER_ID_NULL(168,"用户ID不能为空"),
    USERNAME_NULL(169,"用户名不能为空"),
    USER_UPDATE_SUCCESS(170,"用户修改成功"),
    USER_UPDATE_FAILED(175,"用户修改失败"),
    USER_PASSWORD_NULL(185,"空密码"),
    USER_ENPASSWORD_NULL(186,"空确认密码"),
    USER_NEW_PASSWORD_NULL(187,"新密码为空"),
    USER_PASSWORD_ERROR(188,"用户名密码错误"),
    USER_CANCLE(189, "用户已注销或等待管理员审核"),
    //验证码
    CODE_ERROR(205,"验证码错误"),
    CODE_NULL(206,"空验证码"),
    MSG_CODE_ERROR(207,"短信验证码错误"),
    PHONE_NULL(207,"手机号码为空"),
    PHONE_EXIST(208,"手机号码已存在"),
    //角色
    ROLE_ID_NULL_NULL(305,"角色ID不能为空"),
    ROLE_NOT_FOUND(306,"角色不存在"),
    ROLE_ADD_SUCCESS(310,"用户角色添加成功"),
    ROLE_ADD_FAILED(315,"用户角色添加失败"),
    ROLE_USER_NOT_FOUND(316,"用户没有角色"),
    ROLE_UPDATE_SUCCESS(320,"用户角色修改成功"),
    ROLE_UPDATE_FAILED(325,"用户角色添加失败"),
    //菜单
    MENU_ROLE_ADMIN_SUCCESS(400,"管理员菜单查询成功"),
    MENU_ROLE_USER_SUCCESS(401,"普通用户设备查询成功"),
    MENU_ROLE_ADMIN_FAILED(405,"菜单查询失败"),
    MENU_ID_NULL(406, "菜单ID不能为空"),
    MENU_PARENTID_NULL(407, "二级菜单必须填写父id"),
    MENU_URL_NULL(408, "菜单路径不能为空"),
    MENU_NAME_NULL(409, "菜单名称不能为空"),
    MENU_NULL(410, "菜单不能为空"),
    //批次管理
    BATCH_ADD_SUCCESS(500,"批次添加成功"),
    BATCH_ADD_FAILEED(505,"批次添加失败"),
    BATCH_UPDATE_SUCCESS(510,"批次更新成功"),
    BATCH_UPDATE_FAILED(515,"批次更新失败"),
    BATCH_DELETE_SUCCESS(520,"批次删除成功"),
    BATCH_DELETE_FAILED(525,"批次删除失败"),
    BATCH_SELECT_SUCCESS(530,"批次查询成功"),
    BATCH_SELECT_FAILED(535,"批次查询失败"),
    BATCH_ID_NULL(506,"批次id为空"),
    BATCH_NULL(506,"批次信息为空"),


    BATCH_PLANT_ONE_NAME_NULL(5451,"第一层蔬菜名称为空"),
    BATCH_CULT_MODEL_ONE_NULL(5461,"第一层控制模式为空"),
    BATCH_TEMPERATURE_ONE_NULL(5471,"第一层温度为空"),
    BATCH_HUMIDITY_ONE_NULL(5481,"第一层湿度为空"),
    BATCH_EC_ONE_NULL(5491,"第一层EC值为空"),
    BATCH_PH_ONE_NULL(5551,"第一层PH值为空"),
    BATCH_LED_ONE_LEFT_NULL(5561,"第一层左侧led为空"),
    BATCH_LED_ONE_MIDDLE_NULL(5571,"第一层中间led为空"),
    BATCH_LED_ONE_RIGHT_NULL(5581,"第一层右侧led为空"),

    BATCH_PLANT_TWO_NAME_NULL(5452,"第二层蔬菜名称为空"),
    BATCH_CULT_MODEL_TWO_NULL(5462,"第二层控制模式为空"),
    BATCH_TEMPERATURE_TWO_NULL(5472,"第二层温度为空"),
    BATCH_HUMIDITY_TWO_NULL(5482,"第二层湿度为空"),
    BATCH_EC_TWO_NULL(5492,"第二层EC值为空"),
    BATCH_PH_TWO_NULL(5552,"第二层PH值为空"),
    BATCH_LED_TWO_LEFT_NULL(5562,"第二层左侧led为空"),
    BATCH_LED_TWO_MIDDLE_NULL(5572,"第二层中间led为空"),
    BATCH_LED_TWO_RIGHT_NULL(5582,"第二层右侧led为空"),

    BATCH_PLANT_THREE_NAME_NULL(5453,"第三层蔬菜名称为空"),
    BATCH_CULT_MODEL_THREE_NULL(5463,"第三层控制模式为空"),
    BATCH_TEMPERATURE_THREE_NULL(5473,"第三层温度为空"),
    BATCH_HUMIDITY_THREE_NULL(5483,"第三层湿度为空"),
    BATCH_EC_THREE_NULL(5493,"第三层EC值为空"),
    BATCH_PH_THREE_NULL(5553,"第三层PH值为空"),
    BATCH_LED_THREE_LEFT_NULL(5563,"第三层左侧led为空"),
    BATCH_LED_THREE_MIDDLE_NULL(5573,"第三层中间led为空"),
    BATCH_LED_THREE_RIGHT_NULL(5583,"第三层右边led为空"),

    //订单
    ORDER_ERROR(605, "订单保存出错"),
    ORDER_ID_NULL(606, "订单ID不能为空"),
    ORDER_EXIST(607,"订单已存在"),
    ORDER_NUMBER_NULL(608,"订单号不存在"),
    ORDER_DEPOSIT_NOT_NULL(609, "托管方式不能为空"),
    ORDER_EXPORTID_NOT_NUL(610, "托管专家不能为空"),
    

    //设备
    DEVICE_ID_NULL(705,"设备ID不能为空"),
    DEVICE_SN_NULL(706,"设备序号不能为空"),
    DEVICE_ADD_SUCCESS(710,"设备添加成功"),
    DEVICE_ADD_FAILED(715,"设备添加失败"),
    DEVICE_DELETE_SUCCESS(720,"设备删除成功"),
    DEVICE_DELETE_FAILED(725,"设备删除失败"),
    DEVICE_CHANGE_SUCCESS(730,"设备修改成功"),
    DEVICE_CHANGE_FAILED(735,"设备修改失败"),
    DEVICE_SN_NOT_FOUND(736,"设备序列号不存在"),
    DEVICE_NOT_ACTIVATE(737,"设备未激活，请先开机连接上网络"),
    DEVICE_BINDED(738, "设备已被绑定，不可重复绑定！"),

    //实验
    EXPERIMENT_ID_NULL(805,"实验ID为空"),
    EXPERIMENT_NULL(806,"实验为空"),
    EXPERIMENT_ADD_SUCCESS(810,"实验添加成功"),
    EXPERIMENT_ADD_FAILED(815,"实验添加失败"),
    EXPERIMENT_DELETE_SUCCESS(820,"实验删除成功"),
    EXPERIMENT_DELETE_FAILED(825,"实验删除失败"),
    EXPERIMENT_CHANGE_SUCCESS(830,"设备修改成功"),
    EXPERIMENT_CHANGE_FAILED(835,"设备修改失败"),

    //图片
    IMAGE_NOT_NULL(905, "图片不能为空"),

    //业务异常
    EXCEPTION_NULL(1005, "异常条件不能为空"),

    //字典
    DICT_ADD_SUCCESS(1200,"字典添加成功"),
    DICT_ADD_FAILED(1216,"字典添加失败"),
    DICT_NULL(1205, "字典不能为空"),
    DICT_NAME_NULL(1206, "字典名称不能为空"),
    DICT_ITEM_CODE_NULL(1207, "字典项CODE不能为空"),
    DICT_ITEM_NAME_NULL(1208, "字典项名称不能为空"),
    DICT_CODE_NULL(1209, "字典code不能为空"),
    DICT_ITEM_NULL(1215,"字典项不能为空"),

    //传感器
    SENSOR_ID_NOT_NULL(1005, "传感器ID不能为空"),
    STATUS_NOT_NULL(1006, "开关状态不能为空"),
    SENSOR_TIME(1007,"执行时间和永久执行必选其一"),

    //模型
    MODEL_NOT_NULL(1105, "模型不能为空"),
    MODEL_ID_NOT_NULL(1116,"模型库ID不能为空"),
    MODEL_MODELNAME_NOT_NULL(1107, "模型名称不能为空"),
    MODEL_TEMPERATUREUP_NOT_NULL(1106, "温度上限不能为空"),
    MODEL_TEMPERATUREDOWN_NOT_NULL(1107, "温度下限不能为空"),
    MODEL_HUMIDITYUP_NOT_NULL(1108,"湿度上限不能为空"),
    MODEL_HUMIDITYDOWN_NOT_NULL(1109, "湿度下限不能为空"),
    MODEL_ILLUMINATIONUP_NOT_NULL(1110, "光照强度上限不能为空"),
    MODEL_ILLUMINATIONDOWN_NOT_NULL(1111, "光照强度下限不能为空"),
    MODEL_CO2UP_NOT_NULL(1112, "二氧化碳浓度上限不能为空"),
    MODEL_CO2DOWN_NOT_NULL(1113, "二氧化碳浓度下限不能为空"),
    MODEL_ECUP_NOT_NULL(1114,"EC值上限不能为空"),
    MODEL_ECDOWN_NOT_NULL(1115, "EC值下限不能为空"),
    MODEL_OXYGENUP_NOT_NULL(1116, "氧气浓度上限不能为空"),
    MODEL_OXYGENDOWN_NOT_NULL(1111, "氧气浓度下限不能为空"),
    MODEL_PHUP_NOT_NULL(1116, "PH值上限不能为空"),
    MODEL_PHDOWN_NOT_NULL(1117, "PH值下限不能为空"),
    MODEL_HIGHLEVELUP_NOT_NULL(1112, "高液位上限不能为空"),
    MODEL_HIGHTLEVELDOWN_NOT_NULL(1113, "高液位下限不能为空"),
    MODEL_LOWLEVELUP_NOT_NULL(1114,"低液位上限不能为空"),
    MODEL_LOWLEVELDOWN_NOT_NULL(1115, "低液位下限不能为空"),
	
	//参数
	PARAM_NOT_NULL(1200, "系统参数不能为空"),
	PARAM_NAME_NOT_NULL(1201, "参数名称不能为空"),
	PARAM_CODE_NOT_NULL(1202, "参数code不能为空"),
	PARAM_STATUS_NOT_NULL(1204, "参数状态不能为空"),
	PARAM_ID_NOT_NULL(1205, "参数ID不能为空"),
	PARAM_VALUE_NOT_NULL(1203, "参数值不能为空");
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    ResultStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
