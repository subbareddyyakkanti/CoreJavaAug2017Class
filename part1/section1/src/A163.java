class A163 
{
	A163()
	{
		System.out.println("A163()");
	}
	{
		System.out.println("IIB");
	}
	A163(int i)
	{
		this();
		System.out.println("A163(int)");
	}

	public static void main(String[] args) 
	{
		A163 a=new A163();
		System.out.println("----");
		A163 b=new A163(20);
		System.out.println("-----");
	}
}
