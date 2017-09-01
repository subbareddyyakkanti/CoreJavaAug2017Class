abstract class B35a
{
	abstract void method1();
	abstract void method2();
	abstract void method3();
	abstract void method4();
}
abstract class B35b extends B35a
{
	void method1()
	{
		System.out.println("from method1");
	}
	abstract void method5();
}
class B35 extends B35b
{
	void method2()
	{
		System.out.println("from method2");
	}
	void method3()
	{
		System.out.println("from method3");
	}
	void method4()
	{
		System.out.println("from method4");
	}
	void method5()
	{
		System.out.println("from method5");
	}
	public static void main(String ar[])
	{
		B35 b1=new B35();
		b1.method1();
		b1.method2();
		b1.method3();
		b1.method4();
		b1.method5();
		System.out.println("done");
	}
}