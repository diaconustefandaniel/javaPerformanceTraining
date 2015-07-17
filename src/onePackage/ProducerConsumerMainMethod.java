package onePackage;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerMainMethod {
	   public static void main(String[] args) {
		   final int numberPeople=100;
	      Resource r= new Resource();
	      List<Producer> allProducers=new ArrayList<Producer>();
	      List<Consumer> allConsumers=new ArrayList<Consumer>();
	      
	      
	      for(int i=0;i<=numberPeople;i++)
	      {
	    	  Producer p1=new Producer(r,i);
	    	  allProducers.add(p1);
	      }
	      
	      for(int i=0;i<=numberPeople;i++)
	      {
	    	  Consumer c1=new Consumer(r,i);
	    	  allConsumers.add(c1);
	      }
	      
	    	  
	      
	      for(int i=0;i<=numberPeople;i++)
	      {
	    	  allProducers.get(i).start();
	    	  allConsumers.get(i).start();
	      }
	    	  
	     /* Producer p1 = new Producer(r, 1);
	      Consumer c1 = new Consumer(r, 1);
	     // Producer p2 = new Producer(r, 2);
	     // Consumer c2 = new Consumer(r, 2);
	     //Consumer c3 = new Consumer(r, 3);
	      //Producer p3 = new Producer(r, 3);
	      p1.start(); 
	      c1.start();
	    //  c3.start();
	      c2.start();
	      p2.start();*/
	      
	      
	   }
	}