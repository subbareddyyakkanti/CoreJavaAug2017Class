class A136 
{
	int i;
	static int j;

	public static void main(String[] args) 
	{
		A136 a=new A136();
		a.i=10;
		j=20;
		A136 b=new A136();
		b.i=30;
		j=40;
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(j);
	}
}
