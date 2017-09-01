class A174A 
{
	A174A()
	{
		System.out.println("A174A()");
	}
}
class A174B extends A174A
{
	A174B()
	{
		System.out.println("A174B()");
	}
}
class A174C extends A174B
{
	A174C()
	{
		System.out.println("A174C()");
	}
}
class A174D extends A174C
{
	A174D()
	{
		System.out.println("A174D()");
	}
}
class A174 extends A174D
{
	A174()
	{
		System.out.println("A174()");
	}

	public static void main(String[] args) 
	{
		A174A a=new A174A();
		System.out.println("----");
		A174B b=new A174B();
		System.out.println("----");
		A174C c=new A174C();
		System.out.println("----");
		A174D d=new A174D();
		System.out.println("----");
		A174 e=new A174();
		System.out.println("----");
	}
}
