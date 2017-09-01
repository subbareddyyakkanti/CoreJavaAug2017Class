interface B65a
{
	void test1();
}
class B65b
{
	public void test1()
	{
		System.out.println("from test1");
	}
}
class B65 extends B65b implements B65a
{
	public static void main(String ar[])
	{
		B65 b1=new B65();
		b1.test1();
		System.out.println("done");
	}
}