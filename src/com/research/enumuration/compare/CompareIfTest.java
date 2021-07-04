package com.research.enumuration.compare;

import com.research.enumuration.EscapeEnum;

public class CompareIfTest {
	public static void main(String[] args) {
		EscapeEnum escapeEnum = EscapeEnum.DOOR;
		if(escapeEnum == EscapeEnum.DOOR) {
			System.out.println("从正门出去");
		}else if (escapeEnum == EscapeEnum.WINDOW) {
			System.out.println("翻窗子出去");
		}else if(escapeEnum == EscapeEnum.CABINET) {
			System.out.println("不行了，躲柜子里");
		}
	}
}
