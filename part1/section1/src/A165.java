class A165 
{
	{
		System.out.println("IIB1");
	}
	static
	{
		System.out.println("SIB1");
	}
	A165()
	{
		System.out.println("A165()");
	}
	{
		System.out.println("IIB2");
	}
	static
	{
		System.out.println("SIB2");
	}
	A165(double d)
	{
		this();
		System.out.println("A165(double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A165 a=new A165();
		System.out.println("____");
		A165 b=new A165(10.5);
		System.out.println("main end");
	}
}
