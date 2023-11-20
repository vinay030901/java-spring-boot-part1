package com.lambda;

public class Program1 implements Program1Inter{

	public static void main(String[] args) {
		Program1Inter i=new Program1Inter() {
			
			@Override
			public void sayHello() {
				System.out.println("this is an anonymous class");
			}
		};
		i.sayHello();
		
		Program1Inter p=()->System.out.println("this is lambda function");
		p.sayHello();
		
		Program1Inter q=()->System.out.println("this is second lambda function");
		q.sayHello();
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

}
