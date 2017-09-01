abstract class B37a
{
	void test1()
	{
		System.out.println("from test1");
	}
}
abstract class B37b
{
}
class B37c extends B37a
{

}
class B37d extends B37b
{
}
class B37
{
	public static void main(String ar[])
	{
		//B37a a1=new B37a();
		//a1.test1();
		System.out.println("---");
		//B37b b1=new B37b();
		System.out.println("----");
		B37c c1=new B37c();
		c1.test1();
		System.out.println("---");
		B37d d1=new B37d();
		System.out.println("----");
	}

}