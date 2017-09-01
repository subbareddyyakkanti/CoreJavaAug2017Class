class A164 
{
	{
		System.out.println("IIB");
	}
	A164(int i)
	{
		System.out.println("A164(int)");
	}
	{
		System.out.println("IIB2");
	}
	A164()
	{
		this(10);
		System.out.println("A164()");
	}
	public static void main(String[] args) 
	{
		A164 a=new A164();
		System.out.println("----");
		A164 b=new A164(20);
		System.out.println("----");
	}
}
