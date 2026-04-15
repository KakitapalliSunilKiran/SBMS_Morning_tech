package paypackage;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Injecting through constructor
		//Injecting through setter
		//Injecting through field injection
//		PaymentInterface pi = new PaymentInterface();
//		pi.p=new DebitCardPayment();
		
	//	pi.processPayment();
		//PaymentInterface pi=new PaymentInterface();
		//PaymentInterface pi = new PaymentInterface(new DebitCardPayment());
//		pi.processPayment();
//		
		PaymentInterface pi1 = new PaymentInterface();
		pi1.setP(new CreditCardPayment());
		pi1.processPayment();
		
//		PaymentInterface pi = new PaymentInterface(new DebitCardPayment());
//		//pi.setP(new CreditCardPayment());
//		pi.processPayment();
		

	}

}
