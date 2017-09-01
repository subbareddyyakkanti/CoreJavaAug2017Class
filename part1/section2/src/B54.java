interface B54a
{
	void test1();
	void test2(int i);
	double test3(boolean b);
}
abstract class B54b implements B54a
{
	public void test2(int i)
	{
		System.out.println("from test2");
	}

}
abstract class B54c extends B54b
{
	public void test1()
	{
		System.out.println("from test1");
	}
	abstract void test4();

}
class B54 extends B54c
{
	public double test3(boolean b)
	{
		System.out.println("from test3");
		return 29.4;
	}
	void test4()
	{
		System.out.println("from test4");
	}

	public static void main(String ar[])
	{
		B54 b1=new B54();
		b1.test1();
		b1.test2(20);
		b1.test4();
		System.out.println(b1.test3(true));
	}
}