package onePackage;

class Resource {
	private int contents;
	private boolean available = false;
	public int nrMax=1000;
	

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}
