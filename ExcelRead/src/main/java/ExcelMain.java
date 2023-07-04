import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String d = ExcelCode.getStringData(0, 0);
		System.out.println(d);
		String e = ExcelCode.getIntegerData(3, 0);
		System.out.println(e);

	}

}
