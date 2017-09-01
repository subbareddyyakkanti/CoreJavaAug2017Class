interface B66a
{
	void test1();
	void test2();
}
class B66b
{
	public void test1()
	{
		System.out.println("from test1");
	}
}
class B66 extends B66b implements B66a
{
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String a[])
	{
		B66 b1=new B66();
		b1.test1();
		b1.test2();
		System.out.println("done");
	}
}