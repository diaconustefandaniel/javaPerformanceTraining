package onePackage;

class Producer extends Thread {
	private Resource resource;
	private int number;

	public Producer(Resource r, int number) {
		resource = r;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < resource.nrMax; i++) {
			resource.put(i);
			System.out.println("PRODUCER #" + this.number + " put: " + i);
			try {
				sleep((int) (Math.random() * 50));
			} catch (InterruptedException e) {
			}
		}
	}
}