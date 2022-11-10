package protectorPackage;

	public class ProtectedClass//can not declare as protected 
	{
		protected int b=40;
			protected void display9()
			{
				
			System.out.println("this is display9 protected method");
			
			}
			public static void main(String args[])
			{
				ProtectedClass p=new ProtectedClass();
				p.display9();
				System.out.println(p.b);
				

			}
			
		}
	
