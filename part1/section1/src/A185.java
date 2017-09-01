class A185A 
{
	A185A()
	{
		System.out.println("A185A()");
	}
	static
	{
		System.out.println("A185A-SIB");
	}
	
	{
		System.out.println("A185A-IIB");
	}
}
class A185B extends A185A
{
	A185B()
	{
		System.out.println("A185B()");
	}
   
	{
		System.out.println("A185B-IIB");
	}
	static
	{
	   System.out.println("A185B-SIB");
	}

	
}
class A185
{
    public static void main(String[] args) 
	{
		System.out.println("main begin");
		A185A a=new A185A();
		System.out.println("-----");
		A185B b=new A185B();
		System.out.println("main end");
	}
	
	static
	{
		System.out.println("A185-SIB");
	}
	
}
class A185M1
{
	public static void main(String arg[])
	{
		System.out.println("main begin");
		A185B b2=new A185B();
		System.out.println("-----");
		A185A a2=new A185A();
		System.out.println("main end");
    }
	static
	{
		System.out.println("A185M1-SIB");
	}
}

class A185M2 extends A185A
{
	public static void main(String arg[])
	{
		System.out.println("main begin");
		A185B b3=new A185B();
		System.out.println("----");
		A185A a3=new A185A();
		System.out.println("main end");
	}
	static
	{
		System.out.println("SIB-A185M2");
	}
}

class A185M3 extends A185B
{
	public static void main(String arg[])
	{
		System.out.println("main begin");
		A185B b4=new A185B();
		System.out.println("----");
		A185A a4=new A185A();
		System.out.println("main end");
	}
	static
	{
		System.out.println("SIB-A185M3");
	}
}