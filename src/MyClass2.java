import java.sql.Timestamp;
import java.util.UUID;

public class MyClass2 {

	public static String concat(String s1,String s2,String s3,String s4,String s5,String s6)
	{
		String result="";
		result+=s1;
		result+=s2;
		result+=s3;
		result+=s4;
		result+=s5;
		result+=s6;
		return result;
		
	}
	
	public static String concat2(String s1,String s2,String s3,String s4,String s5,String s6)
	{
		StringBuffer result=new StringBuffer();
		result.append(s1);
		result.append(s2);
		result.append(s3);
		result.append(s4);
		result.append(s5);
		result.append(s6);
	
		return result.toString();
		
		
	}
	
	public static String concat3(String s1,String s2,String s3,String s4,String s5,String s6)
	{
		return s1+s2+s3+s4+s5+s6;
	}
	
	public static String concat4(String s1,String s2,String s3,String s4,String s5,String s6)
	{
		StringBuffer result=new StringBuffer(s1.length()+s2.length()+s3.length()+s4.length()+s5.length()+s6.length()).append(s1).append(s2).append(s3).append(s4).append(s5).append(s6);
		
		return result.toString();
		
		
	}
	
	public static String concat5(String s1,String s2,String s3,String s4,String s5,String s6)
	{
		StringBuilder result=new StringBuilder(s1.length()+s2.length()+s3.length()+s4.length()+s5.length()+s6.length()).append(s1).append(s2).append(s3).append(s4).append(s5).append(s6);
		
		return result.toString();
		
		
	}
	
	
	
	
	public static void main(String argv[])
	{
		calculateTime();
		calculateTime2();
		calculateTime3();
		calculateTime4();
		calculateTime5();
	}

	private static void calculateTime() {
		long t1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			String s1=UUID.randomUUID().toString();
			String s2=UUID.randomUUID().toString();
			String s3=UUID.randomUUID().toString();
			String s4=UUID.randomUUID().toString();
			String s5=UUID.randomUUID().toString();
			String s6=UUID.randomUUID().toString();
			 
			concat(s1,s2,s3,s4,s5,s6);
		}
		long t2=System.currentTimeMillis();
		long t3=t2-t1;
		System.out.println("First method took "+ t3);
	}
	
	
	private static void calculateTime2() {
		long t1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			String s1=UUID.randomUUID().toString();
			String s2=UUID.randomUUID().toString();
			String s3=UUID.randomUUID().toString();
			String s4=UUID.randomUUID().toString();
			String s5=UUID.randomUUID().toString();
			String s6=UUID.randomUUID().toString();
			 
			concat2(s1,s2,s3,s4,s5,s6);
		}
		long t2=System.currentTimeMillis();
		long t3=t2-t1;
		System.out.println("Second method took "+ t3);
	}
	
	private static void calculateTime3() {
		long t1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			String s1=UUID.randomUUID().toString();
			String s2=UUID.randomUUID().toString();
			String s3=UUID.randomUUID().toString();
			String s4=UUID.randomUUID().toString();
			String s5=UUID.randomUUID().toString();
			String s6=UUID.randomUUID().toString();
			 
			concat3(s1,s2,s3,s4,s5,s6);
		}
		long t2=System.currentTimeMillis();
		long t3=t2-t1;
		System.out.println("Third method took "+ t3);
	}
	
	private static void calculateTime4() {
		long t1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			String s1=UUID.randomUUID().toString();
			String s2=UUID.randomUUID().toString();
			String s3=UUID.randomUUID().toString();
			String s4=UUID.randomUUID().toString();
			String s5=UUID.randomUUID().toString();
			String s6=UUID.randomUUID().toString();
			 
			concat4(s1,s2,s3,s4,s5,s6);
		}
		long t2=System.currentTimeMillis();
		long t3=t2-t1;
		System.out.println("Last method took "+ t3);
	}
	
	private static void calculateTime5() {
		long t1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			String s1=UUID.randomUUID().toString();
			String s2=UUID.randomUUID().toString();
			String s3=UUID.randomUUID().toString();
			String s4=UUID.randomUUID().toString();
			String s5=UUID.randomUUID().toString();
			String s6=UUID.randomUUID().toString();
			 
			concat4(s1,s2,s3,s4,s5,s6);
		}
		long t2=System.currentTimeMillis();
		long t3=t2-t1;
		System.out.println("Last method took "+ t3);
	}
	
	
}
