package day3;

import onePackage.Resource;

class Producer extends Thread {
	private BankAccount banAccount;
	private int number;

	public Producer(BankAccount b, int number) {
		banAccount = b;
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