package cn.uc.yqb.utils;

public class Result {
	
	/**
	 * 响应码
	 */
	private int code;
	/**
	 * 结果
	 */
	private boolean msg;
	/**
	 * 内容
	 */
	private Object retData;
	
	public Result(){
		
	}
	public Result(int code, boolean msg, Object retData) {
		super();
		this.code = code;
		this.msg = msg;
		this.retData = retData;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public boolean isMsg() {
		return msg;
	}
	public void setMsg(boolean msg) {
		this.msg = msg;
	}
	public Object getRetData() {
		return retData;
	}
	public void setRetData(Object retData) {
		this.retData = retData;
	}
	
	
}
