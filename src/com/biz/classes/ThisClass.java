package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class ThisClass {

	List<String> stList;

	public ThisClass() {
		this("몽이");
	}

	public ThisClass(String name) {
		this(name,12);
	}
	
	public ThisClass(String name, int age) {
		this.stList = new ArrayList();
		stList.add(name);
	}

}
