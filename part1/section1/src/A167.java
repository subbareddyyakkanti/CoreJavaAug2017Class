class A167A 
{
	static
	{
		System.out.println("A167A-SIB");
	}
	A167A()
	{
		System.out.println("A167A()");

	}
	{
		System.out.println("A167A-IIB");
	}
}
class A167
{
  static
	{
	  System.out.println("A167-SIB");
	}
	A167()
	{
		System.out.println("A167()");
	}
	{
		System.out.println("A167-IIB");
	}
	A167(int i)
	{
		A167A a=new A167A();
		System.out.println("A167(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A167 b=new A167();
		System.out.println("----");
		A167 c=new A167(40);
		System.out.println("----");
		System.out.println("main end");
	}
}
