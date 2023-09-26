package NewPackage;

public interface Car {
	
	public void ingine();  //un implimented abstract method
	
	public void seats();
	
	public void  gears();
	
	public void camera();
	
	public void tyres();
	
	default void audio() {   //default method
		System.out.println("audio code");
		
	}
	
	static void security() {  //static method
		System.out.println("automatic lock");
	}
	static void fuel() {   //static method
		System.out.println("fule should be petrol");  
	}
	
	static void groud_clearence() {   //static method
		System.out.println("ground clearence must be 170 cm");
	}
	static void start() {   //static method
		System.out.println("engine should start with push button ");
	}
}
	
	
	
	


