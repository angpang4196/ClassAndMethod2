package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {

	List<String> stList;

	public MyClass06() {
		stList = new ArrayList();
	}

	public void add(int num) {
		String strNum = "" + num;
		this.stList.add(strNum);
	}

	public int sum() {
		int intSize = stList.size();
		int intSum = 0;

		for (int i = 0; i < intSize; i++) {
			String strNum = stList.get(i);
			int intNum = Integer.valueOf(strNum);
			intSum += intNum;
		}

		return intSum;
	}

}
