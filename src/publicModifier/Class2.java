package publicModifier;

public class Class2 
{
	public void display1()
	{
		System.out.println("this is my publicclass accesible outside class and within package");

	}
public static  void main(String args[])
{
	PublicClass t2=new PublicClass();
	t2.display();
	System.out.println(t2.a);

	
	
}
}
