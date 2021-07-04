package com.research.enumuration;

public enum EscapeEnum {
	//定义枚举项
	DOOR("老公没到小区","从正门出去"),
	WINDOW("老公上楼了","翻窗子出去"),
	CABINET("老公进客厅了","不行了，躲柜子里");
	private String location;
	private String operation;
	
	
	//private 构造方法
	private EscapeEnum() {}

	private EscapeEnum(String location, String operation) {
		this.location = location;
		this.operation = operation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}	
}
