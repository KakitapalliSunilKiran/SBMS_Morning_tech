package paypackage;

public class DebitCardPayment implements Payment{

	@Override
	public boolean pay() {
		// TODO Auto-generated method stub
		System.out.println("I am in Debit card class");
		return false;
	}

}
