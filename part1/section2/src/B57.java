interface B57a
{
	void test1();
}
interface B57b
{
	void test2();
}
interface B57c
{
	void test3();
}
class B57 implements B57a,B57b,B57c
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
	public static void main(String ar[])
	{
		B57 b1=new B57();
		b1.test1();
		b1.test2();
		b1.test3();
		System.out.println("done");
	}
}
