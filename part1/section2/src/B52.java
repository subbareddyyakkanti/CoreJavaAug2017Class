interface B52a
{
	void test1();
	void test2(int i);
}
class B52 implements B52a
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2(int i)
	{
		System.out.println("from test2");
	}
	public static void main(String arg[])
	{
		B52 b1=new B52();
		b1.test1();
		b1.test2(10);
		System.out.println("done");
	}
}