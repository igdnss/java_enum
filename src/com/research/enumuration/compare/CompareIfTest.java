package com.research.enumuration.compare;

import com.research.enumuration.EscapeEnum;

public class CompareIfTest {
	public static void main(String[] args) {
		EscapeEnum escapeEnum = EscapeEnum.DOOR;
		if(escapeEnum == EscapeEnum.DOOR) {
			System.out.println("�����ų�ȥ");
		}else if (escapeEnum == EscapeEnum.WINDOW) {
			System.out.println("�����ӳ�ȥ");
		}else if(escapeEnum == EscapeEnum.CABINET) {
			System.out.println("�����ˣ��������");
		}
	}
}
