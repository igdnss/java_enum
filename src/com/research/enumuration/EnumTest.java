package com.research.enumuration;

public class EnumTest {

	public static void main(String[] args) {
		//枚举项就是一个对象
		EscapeEnum door = EscapeEnum.DOOR;
		System.out.println(door.getLocation());
		System.out.println(door.getOperation());
	}

}
