abstract class B36a
{
	void test1()
	{
		System.out.println("from test1");
	}

}
class B36 extends B36a
{
	public static void main(String ar[])
	{
		//B36a a1=new B36a();
		//a1.test1();
		B36 b1=new B36();
		b1.test1();
	}
}
