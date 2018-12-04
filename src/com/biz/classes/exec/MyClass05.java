package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass05 {

	List<Integer> intList;

	public MyClass05() {
		intList = new ArrayList();
	}

	public void add(int num) {
		intList.add(num);
	}

	public int sum() {
		int intSize = intList.size();
		int intSum = 0;

		for (int i : intList) {
			intSum += i;
		}
		return intSum;
	}
}
