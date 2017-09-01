interface B56a
{
	void test1();
}
interface B56b
{
	void test2();
}
class B56 implements B56a,B56b
{
	public void test1()
	{
		System.out.println("from test1()");
	}
	public void test2()
	{
		System.out.println("from test2()");
	}
	public static void main(String ar[])
	{
		B56 b1=new B56();
		b1.test1();
		b1.test2();
		System.out.println("done");
	}

}