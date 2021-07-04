package com.research.enumuration;

public enum EscapeEnum {
	//����ö����
	DOOR("�Ϲ�û��С��","�����ų�ȥ"),
	WINDOW("�Ϲ���¥��","�����ӳ�ȥ"),
	CABINET("�Ϲ���������","�����ˣ��������");
	private String location;
	private String operation;
	
	
	//private ���췽��
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
