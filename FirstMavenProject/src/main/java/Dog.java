
public class Dog extends Animal{

	String color ="black";
	Dog(){  
		super();  
		System.out.println("dog is created");  
		}  
	public void printColor () {
		System.out.println(color);
		System.out.println(super.color);
		super.eat();  
	}
	
}
