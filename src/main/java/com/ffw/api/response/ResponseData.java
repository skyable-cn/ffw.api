package com.ffw.api.response;

import java.io.Serializable;

public class ResponseData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -994596559692200556L;

	private String code = "0";
	private String message = "success";
	private boolean flag = true;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void fail() {
		this.flag = false;
		this.code = "1000";
		this.message = "fail";
	}

}
