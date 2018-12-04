package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	List<Integer> intList;

	public MyClass04() {
		intList = new ArrayList();
	}

	public void add(int num) {
		this.intList.add(num);
	}

	public void sum() {
		int intSize = intList.size();
		int intSum = 0;
		for (int i = 0; i < intSize; i++) {
			int intNum = intList.get(i);
			intSum += intNum;
		}
		System.out.println("Result : " + intSum);
	}

}
