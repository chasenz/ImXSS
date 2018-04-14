package org.coody.framework.context.enm;

/**
 * 消息响应码枚举
 * 
 * @author deng
 *
 */
public enum ResCodeEnum {

	SUCCESS(0, "操作成功"),// 成功标志
	LOGIN_OUT(1,  "登录超时"),// 登录超时
	API_NOT_EXISTS(2,  "请求action不存在"),// 登录超时
	PARA_ERROR(3,  "参数验证不通过"), // 参数有误
	SYSTEM_ERROR(4,  "系统繁忙，请稍后再试"), //系统繁忙
	PARA_IS_NULL(5,"参数为空"),//自动验参标志
	PARAS_IS_NULL(6,"参数不能同时为空"),//自动验参标志
	USER_OR_PWD_ERROR(7,"用户名或密码有误"),
	USER_IS_EXISTS(8,"该账号已注册"),
	DATA_CHECK_ERROR(9,"数据校检错误"),
	NO_DATA(10,"暂无数据"),
	LACK_CHANNEL(11,"缺少渠道号"),
	CHANNEL_UN_AVA(13,"渠道不可用"),
	CHANNEL_NOT_KEY(14,"渠道KEY不存在"),
	ACTION_NOT_FOUND(15,"请求action不存在"),
	LOGIN_AUTH_ERROR(16,"登录检验失败"),
	USER_REG_ERROR(17,"注册失败，请稍后重试"),
	VER_CODE_SEND_ERROR(18,"验证码发送失败"),
	VER_CODE_SEND_TOO_BUSY(19,"验证码发送过于频繁"),
	VER_CODE_ERROR(20,"验证码校验失败"),
	USER_IS_NOT_EXISTS(21,"该账号不存在"),
	ENVIR_ERROR(22,"环境异常"),
	NICK_NAME_IS_EXISTS(23,"该昵称已存在"),
	NICK_CANT_EDIT(24,"昵称仅能修改一次"),
	USER_IS_FREEZE(25,"该用户已冻结"),
	USER_NUM_TOO_BIG(26,"查询用户数过大"),
	MOST_FIVE(27,"最多可填写5个"),
	FEEDBACK_TOO_BUSY(28,"每天只能反馈一次"),
	IS_TARGE_SHIELDING(29,"已被对方拉黑"),
	FOLLOW_NOT_TO_ONE_SELF(30,"自己不能关注自己"),
	IS_FOLLOWED(30,"不能重复关注"),
	FILE_UPLOAD_ERROR(31,"文件上传失败"),
	USER_NOT_EXISTS(32,"用户不存在"),
	AUDIO_NOT_FOUND(33,"音频不存在"),
	AUDIO_HEARTBEAT_ERROR(34,"音频心跳失败"),
	FLOWER_NOT_ENGHT_ERROR(35,"聆币不足，请充值"),
	ORDER_NOT_EXIST_ERROR(36,"聆币不足，请充值"),
	RUSHING_ORDER_ERROR(37,"抢单失败"),
	ORDER_OVER_ERROR(38,"音频已结束"),
	ORDER_VALID_ERROR(39,"无效音频状态"),
	MATCH_USER_ERROR(40,"非Match用户，无法请求"),
	MASTER_USER_NOT_EXISTS(41,"师傅邮箱不存在"),
	GROUP_IS_EXISTS(42,"小组已经存在，请填写新的小组"),
	LEVEL_NOT_EXISTS(43,"用户级别不存在"),
	NOT_TREE_ERROR(44,"非师徒关系树用户"),
	NOT_APPR_COMMIT(45,"非徒弟关系不可提交"),
	NOT_MP_ERROR(46,"请先设置门派"),
	NOT_LEVEL_ERROR(47,"未达到升级要求，请继续努力！"),
	PARAM_NOT_COMPLETE(48,"参数不完整"),
	NO_SERVER_ERROR(49,"自己不能抢自己发出的订单"),
	OTHER(-1,"其他错误"),
	;
	private int code;
	private String msg;

	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg=msg;
	}
	ResCodeEnum(int code,  String msg) {
		this.code = code;
		this.msg = msg;
	}

}
