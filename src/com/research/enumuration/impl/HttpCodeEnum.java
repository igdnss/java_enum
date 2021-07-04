package com.research.enumuration.impl;


/**
 *枚举类实现接口
 */
public enum HttpCodeEnum implements HttpCode{
	SUCCESS(200,"ok"),
	PAGE_NOT_FOUND(404,"page not found")
	;
	
	int code;
	String description;
	

	private HttpCodeEnum(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
