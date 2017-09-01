class A99 
{
	static int i=test();
	static int j=10;
	static int test()
	{
		System.out.println("from test");
		return j;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
