class A162 
{
	static
	{
		System.out.println("SIB1");
	}
	{
		System.out.println("IIB1");
	}
	A162()
	{
		System.out.println("A162()");
	}
	static{
		System.out.println("SIB2");
	}
	public static void main(String[] args) 
	{
		A162 a=new A162();
		System.out.println("----");
		A162 b=new A162();
		System.out.println("----");
	}
	{
		System.out.println("IIB2");
	}
}
