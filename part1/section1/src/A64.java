class A64 
{
	public static void main(String[] args) 
	{
		int i=0;
		System.out.println(test1(i++));
		System.out.println(test1(++i));
		System.out.println(test2(i++));
		System.out.println(test2(++i));
	}
	static int test1(int i)
	{
		return i++;
	}
	static int test2(int i)
	{
		return ++i;
	}
}
