package PrivateModifier;

public class privateClass12 
{
	public void dispaly5() 
	{
		System.out.println("this is my method display5");
	}
	public static void main(String args[])
	{
		privateClass12 p1=new privateClass12();
		p1.dispaly5();
		
//PrivateClass1 p1=new PrivateClass1();//not accesible in outside class within package

	}
}

