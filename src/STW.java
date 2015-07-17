import java.util.ArrayList;
import java.util.Collection;


/**
 * 
 * @author d.diaconu
 * 
 * stop the world example
 *
 *-XX:+PrintGCApplicationStoppedTime
 *-XX:+PrintGCDetails sa afiseze detaliile despre Garbace Collector alogorithm ..etc
 */

public class STW {

	public static final Collection<Object> leok=new ArrayList<>();
	private static volatile Object unused;
	
	public static void main(String argv[])
	{
		int x=2;
		while(true)
		{
			
				
					/*leok.add(new byte[10 * 1024 * 1024]);
					unused=new byte[10 * 1024 * 1024];*/
			
			
		}
		
		
	}
	
	

}
