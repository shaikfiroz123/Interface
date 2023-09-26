package Over_Loading;

class Example{
	
	void display() {
		System.out.println("Welcome to Method Over Loading");
	}
	
	void display (int x) {
		System.out.println(x);
	}
	
	void display (String name, int y) {
		System.out.println(name);
		System.out.println(y);
	}
	
	void display (char c, String na) {
		System.out.println('S');
		System.out.println("Hussain");
		
	}
		
	}
	


public class Method_Over_Loading {

	public static void main(String[] args) {
		Example ex=new Example();
		ex.display();
		ex.display(10);
		ex.display("Firoz", 20);
		

	}

}
