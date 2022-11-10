package package1;//

import publicModifier.Class2;
import publicModifier.PublicClass;//outside package

public class Class3
	{
		public void dispaly2()
		{
			System.out.println("this is my publicclass accesible outside class and outside package");

		}
		public static void main(String args[])
		{
			Class2 t2=new Class2();
			t2.display1();
			PublicClass p=new PublicClass();//class accesible
			p.display();//method accesible
			System.out.println(p.a);//variable accssible

		}
	}
