interface B64a
{
	void test1();
}
interface B64b
{
	void test2();
}
abstract class B64c
{
  abstract void test3();
  void test4()
	{
	  System.out.println("from test4");
	}
}
class B64 extends B64c implements B64a,B64b
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String a[])
	{
		B64 b1=new B64();
		b1.test1();
		b1.test2();
		b1.test3();
		b1.test4();
		System.out.println("done");
	}
}