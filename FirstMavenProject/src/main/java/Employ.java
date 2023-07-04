
public class Employ {

	private int id;
	private String name;
	public int getId() {
		return id;	
	}
	public void setId(int id) {
		this.id = id;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;	
	}

	public static void main(String[] args) {
		Employ obj = new Employ(); //to view output create object and call getter and setter method
		obj.setId(10);
		System.out.println(obj.getId());

	}

}
