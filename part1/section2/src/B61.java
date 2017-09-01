class B61a
{
	void test1()
	{
		System.out.println("from test1");
	}

}
interface B61b
{
	void test2();
}
class B61 extends B61a implements B61b
{
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String ar[])
	{
		B61 b1=new B61();
		b1.test1();
		b1.test2();
		System.out.println("done");
	}

}