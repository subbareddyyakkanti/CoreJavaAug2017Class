class A144 
{
	A144()
	{
		System.out.println("A144()");
	}
	A144(int i)
	{
		System.out.println("A144(int)");
	}
	public static void main(String[] args) 
	{
		A144 a=new A144();
		System.out.println("---");
		A144 b=new A144(20);
		System.out.println("----");
		A144 c=new A144();
		System.out.println("----");
	}
}
