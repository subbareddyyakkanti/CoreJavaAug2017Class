class A180A 
{
	A180A(double i)
	{
		System.out.println("A180A(double)");
	}
}
class A180B extends A180A
{
    A180B()
	{
		super(9.9);
		System.out.println("A180B()");
	}
	A180B(double d)
	{
		super(d);
		System.out.println("A180B(double)");
	}
}
class A180
{
	public static void main(String[] args) 
	{
		A180A a=new A180A(9.8);
		System.out.println("----");
		A180B b=new A180B();
		System.out.println("-----");
		A180B c=new A180B(9.9);
	}
}
