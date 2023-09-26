package Over_Loading;

class Parent {
	void show () {
		System.out.println("parent");
	}
}
class Child  extends Parent{
	void show () {
		super.show();  //calling immediate parent class 
		System.out.println("child");
	
	}
}
	


public class Over_Riding {

	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.show();
		
	

	}

}
