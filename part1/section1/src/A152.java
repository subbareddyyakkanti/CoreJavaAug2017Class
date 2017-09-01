class A152 
{
	A152()
	{
		this(2,5);
		System.out.println("A152()");
	}
	A152(int i)
	{
		this();
		System.out.println("A152(int)");
	}
	A152(int i,int j)
	{
		System.out.println("A152(int ,int)");
	}

	public static void main(String[] args) 
	{
		A152 a=new A152();
		System.out.println("-----");
		A152 b=new A152(10);
		System.out.println("-----");
		A152 c=new A152(10,30);
		System.out.println("-----");
	}
}
