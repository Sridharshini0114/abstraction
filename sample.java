package abstraction;

abstract class Demo
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is a get2 function");
	}
}
class D extends Demo
{

	void get1() {
		
		System.out.println("This is abstract function..");
	}
	
}
public class sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
