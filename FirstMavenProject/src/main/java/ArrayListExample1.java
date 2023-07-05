import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");  //It is used to insert the specified element at the specified position in a list.
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Blue");


		System.out.println(colors);
		colors.remove(2);
		System.out.println(colors);
		
		//System.out.println("The element at index 2 in the ArrayList is: " + colors.get(2));
		/* System.out.println(colors); 


		  System.out.println(fruits.lastIndexOf("Orange")); ArrayList<String> veg = new
		  ArrayList<String>(); veg.add("Potato"); veg.add("Carrot");
		  fruits.addAll(veg); System.out.println(fruits); Collections.sort(fruits);
		  System.out.println(fruits);

		  for(String f:fruits) { System.out.println(f); }

		  }*/

		/*
		 * Iterator itr = colors.iterator(); //getting the iterator while(itr.hasNext())
		 * //check if iterator has the elements { System.out.println(itr.next());
		 * //printing the element and move to next
		 * 
		 * }
		 */
		
		
	

	}

}
