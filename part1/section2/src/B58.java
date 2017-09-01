interface B58a
{
	void test1();
}
interface B58b
{
	void test2();
}
interface B58c
{
	void test3();
}
abstract class B58d implements B58a,B58b,B58c
{
	public void test2()
	{
		System.out.println("from test2()");
	}
}
class B58 extends B58d
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String a[])
	{
		B58 b1=new B58();
		b1.test1();
		b1.test2();
		b1.test3();
		System.out.println("done");
	}
}