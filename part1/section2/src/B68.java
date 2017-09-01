interface B68a
{
	void test1();
}
interface B68b
{
	void test2();
}
interface B68c extends B68a,B68b
{
	void test3();
}
class B68 implements B68c
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
		B68 b1=new B68();
		b1.test1();
		b1.test2();
		b1.test3();
		System.out.println("done");
	}
}