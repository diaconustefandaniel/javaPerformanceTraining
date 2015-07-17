package day3Gabi;

import java.util.Random;

public class ClientThread extends Thread {
	BankAccount ba;

	public void setBankAccount(BankAccount ba) {
		this.ba = ba;
	}

	@Override
	public void run() {
		while (true) {
			ba.updateBalance(new Random().nextInt(65536) - 32768);
		}
	}

}
