package publicModifier;
//within class within package

public class PublicClass //class declaration
{
	public int a=20;//public  variable declaration
	
public void display()// method declaration
{
	System.out.println("this is my publicclass accesible within class and package");
}

public static void main(String args[])
{
	PublicClass t1= new PublicClass();
	t1.display();
	System.out.println(t1.a);//variable accessible

	
}
}
