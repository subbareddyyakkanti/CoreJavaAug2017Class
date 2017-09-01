class A117a
{
	static int i;
	static void test()
	{
		System.out.println("from test:"+i);
	}
}
class A117 
{
	static int i=10;
	public static void main(String[] args) 
	{
		int i=20;
		System.out.println("from main:"+i);
		System.out.println("from main:"+A117.i);
		System.out.println("from main:"+A117a.i);
		A117a.test();
	}
}
