package com.research.enumuration.compare;

import com.research.enumuration.EscapeEnum;

public class CompareSwitchTest {
	public static void main(String[] args) {
		EscapeEnum escapeEnum = EscapeEnum.DOOR;
		switch(escapeEnum) {
		case DOOR:
			System.out.println("从正门出去");
			break;
		case WINDOW:
			System.out.println("翻窗子出去");
			break;
		case CABINET:
			System.out.println("不行了，躲柜子里");
			break;
		default:break;
		}
	}
}
