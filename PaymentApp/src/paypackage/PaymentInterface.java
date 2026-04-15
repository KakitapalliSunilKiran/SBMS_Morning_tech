package paypackage;

public class PaymentInterface {
	

	Payment p;
	PaymentInterface(Payment p){
		this.p=p;
	}
	PaymentInterface(){
		
	}
	
	public Payment getP() {
		return p;
	}
	public void setP(Payment p) {
		this.p = p;
	}
	void processPayment() 
	{
		boolean flag = p.pay();
		if(flag==true) 
		{
			System.out.println("Your Payment has succesfully processed");
		}else {
			System.out.println("Sorry your Payment got failed");
		}
	}

}
