class A76 
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("a:"+A76.i);
		int i=20;
		System.out.println("b:"+A76.i);
		System.out.println("c:"+i);
		i=30;
		A76.i=40;
		System.out.println("d:"+A76.i);
		System.out.println("e:"+i);
	}
}
