package com.biz.classes.exec;

public class MyClassExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass05 mc5 = new MyClass05();
		
		mc5.add(3);
		mc5.add(7);
		mc5.add(9);
		
		int intResult = mc5.sum();
		
		System.out.println("덧셈 결과 : " + intResult);
	}

}
