package protectorPackage;

//outside class same package
	public class ProtectedClass2
	{
		protected  void display10()
		{
			System.out.println("this is display10 protected method");

		}
		public static void main(String args[])
		{
			ProtectedClass p2=new ProtectedClass();
			p2.display9();
			System.out.println(p2.b);
		}
	}
