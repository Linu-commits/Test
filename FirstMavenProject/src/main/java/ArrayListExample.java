import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");  //It is used to insert the specified element at the specified position in a list.
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add(0,"pineapple");
		fruits.add("Pear");
		fruits.set(0,"Orange");

		System.out.println(fruits);
		System.out.println(fruits.lastIndexOf("Orange"));
		ArrayList<String> veg = new ArrayList<String>();
		veg.add("Potato");
		veg.add("Carrot");
		fruits.addAll(veg);
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);

		for(String f:fruits) { 
			System.out.println(f); 
			
		}
		
		Iterator itr = fruits.iterator(); //getting the iterator
		while(itr.hasNext()) {  //check if iterator has the elements
			System.out.println(itr.next());  //printing the element and move to next
		}

	}

}
