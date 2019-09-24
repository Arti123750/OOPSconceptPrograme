package com.javawings.abstraction;

class Parent
{
void m1()
{
System.out.println("Parent class");	
}
}
class Child extends Parent
{
	void m1()
	{
		System.out.println("Child class");
		
	}
}
public class MethodOverrinding {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Child c1=new Child();
		//Child cp1=new Parent();//
		Parent pc1=new Child();
		
		p1.m1();
		c1.m1();
		pc1.m1();
		
		//***********
		

	}

}
