package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {

	List<String> stList;

	public MyClass07() {
		stList = new ArrayList();
	}

	public void add(String strName, int num) {
		String strNum = String.valueOf(num);

		String strSen = strName + ":" + strNum;

		int intSize = stList.size();
		
			stList.add(strSen);
		
	}

	public void test() {
		int intSize = stList.size();

		for (int i = 0; i < intSize; i++) {
			
			System.out.println(stList.get(i));
		}
		
	}
}
