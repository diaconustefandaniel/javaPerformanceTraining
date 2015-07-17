package onePackage;

class Consumer extends Thread {
	   private Resource resource;
	   private int number;
	   private int consumable=0;
	   public Consumer(Resource r, int number) {
		   resource = r;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	         for (int i = 0; i < resource.nrMax; i++) {
	            value = resource.get();
	            System.out.println("Consumer #" 
				+ this.number
	+ " got: " + value);
	            consumable++;
	            try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	}
	}