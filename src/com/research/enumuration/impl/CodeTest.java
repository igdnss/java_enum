package com.research.enumuration.impl;

public class CodeTest {

	public static void main(String[] args) {
		HttpCode codeEnum = HttpCodeEnum.SUCCESS;
		System.out.println("The code is : "+codeEnum.getCode()+
				" The description is : "+codeEnum.getDescription());
	}

}
