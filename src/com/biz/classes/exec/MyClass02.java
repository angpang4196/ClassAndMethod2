package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	// member 변수 영역
	List<String> stList;

	public MyClass02() {
		stList = new ArrayList();
	}

	public void hello(String strName) {
		// stList는 생성자에서 초기화가 되어
		// MyClass02 클래스의 어떤 위치에서나 읽고 쓰기가 가능한 상태가 된다.
		this.stList.add(strName);
	}

	public void view() {
		int intSize = stList.size();       // List 사용시 size를 변수에 담아서 사용
		for (int i = 0; i < intSize; i++) {
			System.out.println((i + 1) + "번 : " + stList.get(i));
		}

		for (String s : stList) {
			System.out.println(s);
		}

	}

}
