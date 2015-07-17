package threadStuff;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class Fibonacci extends RecursiveTask<BigInteger>{


	public static void main(String argv[])
	{
		//IntStream first = IntStream.builder().add(10).build();
		
		//System.out.println(first);
		
		long t1=System.nanoTime();
		//System.out.println(fibbonaciRecursiv(40));
		long end=System.nanoTime()-t1;
		//long end=System.currentTimeMillis()-
		System.out.println(end);
		long t2=System.nanoTime();
		System.out.println(new ForkJoinPool().invoke(new Fibonacci(40)));
		long end2=System.nanoTime()-t2;
		System.out.println(end2);
	}
	
	private final int n;
	public Fibonacci(int n) {
		this.n=n;
		// TODO Auto-generated constructor stub
	}
	@Override
	protected BigInteger compute() {
		
		
		if(n==0) return BigInteger.ZERO;
		if(n==1) return BigInteger.ONE;
		Fibonacci left= new Fibonacci(n-1);
		left.fork();
		
		Fibonacci right=new Fibonacci(n-2);
		
		BigInteger R=right.compute();
		BigInteger L=left.join();
		return R.add(L);
		
	}
	
	public static BigInteger fibbonaciRecursiv(int n)
	{
		if(n==0) return BigInteger.ZERO;
		if(n==1) return BigInteger.ONE;
		 return fibbonaciRecursiv(n-1).add(fibbonaciRecursiv(n-2));
		
		
	}
	

}
