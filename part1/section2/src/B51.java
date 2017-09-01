interface B51a
{
	void test1();
}
class B51 implements B51a
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String ar[])
	{
		//B51a a1=new B51a();
		B51a a2=null;
		B51 b1=new B51();
		b1.test1();
		System.out.println("done");
	}
}