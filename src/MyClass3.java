import java.util.Arrays;

public class MyClass3 {

	public static void main(String argv[])
	{
		//second example >>>faster>>first example
		//example of branch prediction ..nu se mai intra in if..pentru ca el ghiceste ca nu o sa mai intre in if..
	methodToBeOptimized();
	methodOptimized();
	methodOptimized2();
			
	}

	private static void methodToBeOptimized() {
		short[] a=new short[10_000];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(short)(Math.random()*256) ;
		}
				long sum_low=0l;
				long start=System.nanoTime();
				
				for(int j=0;j<100_000;j++)
				{
					for(int i=0;i<a.length;i++)
					{
						if(a[i]<128)
						{
							sum_low+=a[i];
						}
					}
				}
				long duration=System.nanoTime()-start;
				System.out.println(duration);
	}
	
	
	private static void methodOptimized() {
		short[] a=new short[10_000];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(short)(Math.random()*256) ;
		}
		Arrays.sort(a);
				long sum_low=0l;
				long start=System.nanoTime();
				
				for(int j=0;j<100_000;j++)
				{
					for(int i=0;i<a.length;i++)
					{
						if(a[i]<128)
						{
							sum_low+=a[i];
						}
					}
				}
				long duration=System.nanoTime()-start;
				System.out.println(duration);
	}
	private static void methodOptimized2() {
		short[] a=new short[10_000];
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=(short)(Math.random()*256) ;
//		}
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			a[i]=(short)(256) ;
		}
				long sum_low=0l;
				long start=System.nanoTime();
				
				for(int j=0;j<100_000;j++)
				{
					for(int i=0;i<a.length;i++)
					{
						if(a[i]<128)
						{
							sum_low+=a[i];
						}
					}
				}
				long duration=System.nanoTime()-start;
				System.out.println(duration);
	}
}
