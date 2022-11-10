
public class DefaultClass 
{  int a=30;//defalut declaration
	void display6() //method is default
	{
	System.out.println("this is my defalut method display6");
	}

	DefaultClass()
	{
	System.out.println("this is default constructor");

	}

	public static void main(String args[])
	{
	DefaultClass d=new DefaultClass();
	d.display6();
	System.out.println(d.a);

	}

}
