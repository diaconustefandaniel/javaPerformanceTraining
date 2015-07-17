package day3Atomic;

import day3Gabi.ClientThread;
import day3Gabi.ClientThread2;

public class TestBankAccountAtomic {

	static BankAccountAtomic ba = new BankAccountAtomic(95_000);
	public static void main(String[] args) {
		for (int i=0; i<5;i++)
		{
			ClientThread ct = new ClientThread();
			ct.setBankAccount(ba);
			ct.start();
		}
		
		for (int i=0; i<5;i++)
		{
			ClientThread2 ct = new ClientThread2();
			ct.setBankAccount(ba);
			ct.start();
		}
		
	}
	
}
