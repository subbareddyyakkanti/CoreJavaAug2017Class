interface B62a
{
	void test1();
}
interface B62b
{
	void test2();
}
class B62c
{
	void test3()
	{
		System.out.println("from test3");
	}

}
class B62 extends B62c implements B62a,B62b
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String a[])
	{
		B62 b1=new B62();
		b1.test1();
		b1.test2();
		b1.test3();
		System.out.println("done");
	}
}