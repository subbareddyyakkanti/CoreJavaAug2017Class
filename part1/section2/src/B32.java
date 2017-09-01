abstract class B32a
{
	abstract void test1();
	void test2()
	{
		System.out.println("from test2");
	}
}
class B32 extends B32a
{
  void test1()
	{
	  System.out.println("from test1");
	}
	public static void main(String ar[])
	{
		//B32a a1=new B32a();
		B32 b1=new B32();
		//a1.test1();
		//a1.test2();
		b1.test1();
		b1.test2();
		System.out.println("done");
	}
}