package pack1;
class B13a 
{
	private static B13a obj=null;
	private B13a()
	{
		System.out.println("obj created");
	}
	static
	{
		obj=new B13a();
	}
	public static B13a getObject()
	{
		return obj;
	}
}
class B13
{
	public static void main(String[] args) 
	{
		//B13a b1=new B13a();
		B13a b2=B13a.getObject();
		B13a b3=B13a.getObject();
		B13a b4=B13a.getObject();
		System.out.println("done");
	}
}
