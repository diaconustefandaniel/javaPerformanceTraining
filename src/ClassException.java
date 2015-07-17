import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ClassException {

	final static int incercari = 10000000;

	public static double sum() {

		Random math = new Random();
		// int x=math.nextInt();
		double a = Math.random()*10;
		double b = Math.random()*10;
		// int a=6;
		// int b=7;
		return a + b;
	}

	public static void main(String argv[])  {
		long t1 = System.nanoTime();
		sumMethod();
		long t2 = System.nanoTime();
		System.out.println((t2 - t1));

		long t3 = System.nanoTime();
		try {
			sumMethod2();
		} catch (Exception x) {

		}
		long t4 = System.nanoTime();
		System.out.println((t4 - t3));

		long t5 = System.nanoTime();
		try {
			sumMethod3();
		} catch (MyException e) {

		}
		long t6 = System.nanoTime();
		System.out.println((t6 - t5));
	}

	private static int sumMethod() {
		double sum = 0;
		for (int i = 0; i < incercari; i++) {
			sum = sum();
			// if(sum<12)
			if (ThreadLocalRandom.current().nextDouble() < 0.1) {
				return 5;
			}

		}
		return 0;
	}

	private static int sumMethod2() throws Exception{
		double sum = 0;
		for (int i = 0; i < incercari; i++) {
			Integer x = null;
			sum = sum();
			if (ThreadLocalRandom.current().nextDouble() < 0.1) {
				x.toString();

			}

		}
		return 0;
	}

	private static int sumMethod3() throws MyException {
		double sum = 0;
		for (int i = 0; i < incercari; i++) {
			sum = sum();

			if (ThreadLocalRandom.current().nextDouble() < 0.1) {
				System.out.println(i);
				throw new MyException();
			}

		}
		return 0;
	}

}

class MyException extends Exception {

}
