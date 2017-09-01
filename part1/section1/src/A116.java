class A116a
{
	static int i;
	static void test()
	{
	System.out.println("from test:"+i);
	System.out.println("from test:"+A116a.i);
	}
}
class A116
{
	public static void main(String[] args) 
	{
	System.out.println("from main:"+A116a.i);
	}
}
