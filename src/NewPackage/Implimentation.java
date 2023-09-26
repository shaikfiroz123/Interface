package NewPackage;

public class Implimentation {

	public static void main(String[] args) {
		
		//object creation for Scorpio
		Scorpio sc=new Scorpio();
		System.out.println("Scorpio car :");
		sc.ingine();
		sc.seats();
		sc.gears();
		sc.camera();
		sc.tyres();
		sc.back_door();
		sc.audio();  //calling override method
		Car.security();  //calling static method from interface
		
		System.out.println();
		
		//object creation for Honda
		Honda ho=new Honda();
		System.out.println("Honda car : ");
		ho.ingine();
		ho.seats();
		ho.gears();
		ho.camera();
		ho.tyres();
		ho.audio();  //calling override method
		Car.security();  //calling static method from interface
		Car.groud_clearence();  // calling static method from interface class
		Car.start();  //calling static method from interface class
		
		
		System.out.println();
		
		//object creation for Maruthi
		Maruthi ma=new Maruthi();
		System.out.println("Maruthi car :  ");
		ma.ingine();
		ma.seats();
		ma.gears();
		ma.camera();
		ma.tyres();
		ma.audio();  //calling override method
		Car.security();  //calling static method from interface
		Car.fuel();  //calling static method from interface class 
		
	

	}

}
