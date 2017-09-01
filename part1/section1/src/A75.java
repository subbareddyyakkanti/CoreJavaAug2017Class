class A75 
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(A75.i);
		i=10;
		System.out.println(i);
		System.out.println(A75.i);
		A75.i=20;
		System.out.println(i);
		System.out.println(A75.i);
	}
}
