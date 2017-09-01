class A122a
{
	static int i=10;
	static
	{
		System.out.println("A122a-SIB");
	}
	static void test()
	{
		System.out.println("A122a-test");
	}
}
class A122
{
	static
	{
		System.out.println("A122-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("---aaa---");
		A122a.test();
		System.out.println("----bbb---");
		A122a.test();
		System.out.println("----ccc---");
		System.out.println(A122a.i);
		System.out.println("---ddd---");
	}
}
