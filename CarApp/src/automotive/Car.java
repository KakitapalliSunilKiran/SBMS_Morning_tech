package automotive;

public class Car {
	
	Engine e;
	
	//the process of Injecting dependent class object into target
	//class reference variable is called Dependency Injection
	//Constructor Injection
	//Setter Injection
	//filed Inject
	Car(){
		
	}
	Car(Engine e){
		this.e=e;
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	void startCar() {
		e.startEngine();
	}

}
