package com.research.enumuration.compare;

import com.research.enumuration.EscapeEnum;

public class CompareSwitchTest {
	public static void main(String[] args) {
		EscapeEnum escapeEnum = EscapeEnum.DOOR;
		switch(escapeEnum) {
		case DOOR:
			System.out.println("�����ų�ȥ");
			break;
		case WINDOW:
			System.out.println("�����ӳ�ȥ");
			break;
		case CABINET:
			System.out.println("�����ˣ��������");
			break;
		default:break;
		}
	}
}
