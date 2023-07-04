
public class Review {
int a,b;

	public static void main(String[] args) {
		Review obj = new Review();
		obj.add(4, 5);
		obj.add(12.5, 13.5);

	}

public void add(int a,int b) {
	int s=a+b;
	System.out.println(s);
}
public void add(double a,double b) {
	double s=a+b;
	System.out.println(s);
}


}
