interface B73a
{
	void test1(int i,int j);
}
abstract class B73 implements B73a
{
	public void test1(int i,double j)
	{
		System.out.println("from test1()");
	}
}