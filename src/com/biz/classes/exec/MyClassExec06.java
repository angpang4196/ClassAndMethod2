package com.biz.classes.exec;

public class MyClassExec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass06 mc6 = new MyClass06();

		mc6.add(6);
		mc6.add(12);
		mc6.add(18);

		int intResult = mc6.sum();

		System.out.println("Sum Result : " + intResult);

	}

}
