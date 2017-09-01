interface B55a
{
	void test1();
}
class B55b
{
	void test2()
	{
		System.out.println("from test2");
	}

}
class B55  extends B55b  implements B55a 
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String ar[])
	{
		B55b b1=new B55b();
		b1.test2();
		System.out.println("--------");
		B55 b2=new B55();
		b2.test1();
		b2.test2();
	}
}