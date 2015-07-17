import java.util.ArrayList;
import java.util.Collection;

public class MyClass {
	public static final Collection<Object> leok = new ArrayList<>();
	private static volatile Object unused;

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String argv[]) throws InterruptedException {

		/*
		 * while(true) {
		 * 
		 * }
		 */
		int x = 5;
		int sum = 0;
		for (int i = 0; i < 6; i++)
			sum = sum + i;

		while (true) {
			try {
				Thread.sleep(100);
				AuxiliarClass.display();
				leok.add(new byte[10 * 1024 * 1024]);
				unused = new byte[10 * 1024 * 1024];

				sum(2, 5);
			} catch (OutOfMemoryError e) {

				leok.clear();
			}
		}
	}
}
