class A159
{
	{
		System.out.println("IIB1");
	}
	A159()
	{
		System.out.println("A159()");
	}
	{
		System.out.println("IIB2");
	}
	A159(int i)
	{
		System.out.println("A159(int)");
	}
	public static void main(String[] args) 
	{
		A159 a=new A159();
		System.out.println("----");
		A159 b=new A159();
		System.out.println("----");
	}
}
