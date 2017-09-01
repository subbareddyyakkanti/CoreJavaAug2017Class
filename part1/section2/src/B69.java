interface B69a
{
	void test1();
}
interface B69b
{
	void test2();
}
interface B69c extends B69a,B69b
{
	void test3();
}
interface B69d
{
	void test4();
}
class B69e
{
	void test5()
	{
		System.out.println("from test5");
	}
}
class B69 extends B69e implements B69c,B69d
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
	public void test4()
	{
		System.out.println("from test4");
	}
	public static void main(String ar[])
	{
		B69 b=new B69();
		b.test1();
		b.test2();
		b.test3();
		b.test4();
		b.test5();
		System.out.println("done");
	}
}