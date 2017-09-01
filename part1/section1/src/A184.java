class A184A 
{
	static
	{
		System.out.println("A184A-SIB");
	}
	A184A()
	{
		System.out.println("A184A()");
	}
	{
		System.out.println("A184A-IIB");
	}
}
class A184B extends A184A
{
   static
	{
	   System.out.println("A184B-SIB");
	}
	{
		System.out.println("A184B-IIB");
	}

	A184B()
	{
		System.out.println("A184B()");
	}
}
class A184 extends A184B
{
    A184()
	{
		System.out.println("A184()");
	}
	{
		System.out.println("A184-IIB");
	}
    static
	{
		System.out.println("A184-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A184A a=new A184A();
		System.out.println("-----");
		A184B b=new A184B();
		System.out.println("-----");
		A184 c=new A184();
		System.out.println("main end");
	}
}
