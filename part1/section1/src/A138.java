class A138 
{
	int i;

	public static void main(String[] args) 
	{
		A138 a=new A138();
		System.out.println(a.i);
		A138 b=new A138();
		System.out.println(b.i);
		A138 c=new A138();
		System.out.println(c.i);
		a.i=10;
		b.i=20;
		c.i=30;
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(c.i);
	}
}
