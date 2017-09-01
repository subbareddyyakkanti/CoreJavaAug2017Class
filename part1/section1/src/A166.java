class A166A 
{
	{
		System.out.println("A166A-IIB1");
	}
	A166A()
	{
		System.out.println("A166A()");
	}
	{
		System.out.println("A166A-IIB2");
	}
}
class A166
{
	{
		System.out.println("A166-IIB1");
	}
	A166()
	{
		System.out.println("A166()");
	}
	{
		System.out.println("A166-IIB2");
	}
	A166(int i)
	{
		System.out.println("A166(int)");
	}
	static
	{
		System.out.println("A166-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A166 a=new A166();
		System.out.println("----");
		A166A b=new A166A();
		System.out.println("----");
		A166 c=new A166(20);
		System.out.println("main end");
	}
}
