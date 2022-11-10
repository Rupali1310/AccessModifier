package PrivateModifier;
//private modifier used with variable ,method,constructor 
public class PrivateClass1//class can not declared as private 
{
private int a=20;
private PrivateClass1()
{
	System.out.println("This is my private cinstructor");
}

private void display()
{
System.out.println("This is my private method");	
}

public static void main(String args[])
{
	PrivateClass1 p1=new PrivateClass1();//constructor can access in same class
	p1.display();//method also access in same class
	System.out.println(p1.a);	//varable can access
	
	
}
}

			
