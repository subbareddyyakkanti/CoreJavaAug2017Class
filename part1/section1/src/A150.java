class A150

{
	A150()
	{
		System.out.println("A150()");
	}
	A150(int i)
	{
		this();
		System.out.println("A150(int)");
	}

	public static void main(String[] args) 
	{
		A150 a=new A150();
		System.out.println("----");
		A150 b=new A150(10);
		System.out.println("-----");
	}
}
