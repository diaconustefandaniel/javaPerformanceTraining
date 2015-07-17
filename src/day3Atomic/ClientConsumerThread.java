package day3Atomic;

import java.util.Random;

import day3Gabi.BankAccount;

public class ClientConsumerThread extends Thread{

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
