class A89 
{
	static int i;

	public static void main(String[] args) 
	{
		int i=10;
		System.out.println(i);
		System.out.println(A89.i);
		i=20;
		A89.i=30;
		System.out.println(A89.i);
		System.out.println(i);
	}
}
