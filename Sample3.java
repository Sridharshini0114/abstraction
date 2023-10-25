package abstraction;

abstract class AmountCredit
{
	abstract void credit();
}
abstract class AmountDebit
{
	abstract void debit();
}
class Demo1 extends AmountCredit
{

	void credit() {
		
		System.out.println("This credit function");
		
	}

}
class Demo2 extends AmountDebit
{

	void debit() {
		
		System.out.println("This debit function");
		
	}

}
public class Sample3 {

	public static void main(String[] args) {
		
		AmountCredit f1=new Demo1();//Factory Method
		f1.credit();
		AmountDebit f2=new Demo2();
		f2.debit();

	}

}