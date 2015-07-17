
public class MyJavaClass {
	
	
	public static void main(String argv[])
	{

		final int N=1_000;
		Object[] arr1=new Object[N];
		Object[] arr2=new Object[N];
		
		for(int i=0;i<N;i++)
		{
			arr1[i]=new byte[1024];
			arr2[i]=new byte[1024];
		}
		
		//System.out.println("prima varianta");
		long start=System.nanoTime();
		
		for(int k=0;k<100;k++)
			for(int i=0;i<N;i++)
			{
				Object aux=arr1[i];
				arr1[i]=arr2[i];
				arr2[N-i-1]=aux;
						
			}
		long duration1=System.nanoTime() - start;
		//System.out.println("a doua varianta");
		long start2=System.nanoTime();
		for(int k=0;k<100;k++)
			for(int i=0;i<N-1;i++)
			{
				Object aux=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=aux;
				
			}
		
		long duration2=System.nanoTime()-start2;
		
		//System.out.println("a treia varianta");
		long start3=System.nanoTime();
		for(int k=0;k<100;k++)
			for(int i=0;i<N-1;i+=16)
			{
				arr1[i]=arr2[i];
				arr2[N-i-1]=arr1[i];
				
			}
		long duration3=System.nanoTime()-start3;
		
		System.out.println(duration1 + " "+duration2+" "+ duration3);
		
		
		//prima varianta =4x ...a doua varianta =2x........a treia varianta =x
				
		
	}

}
