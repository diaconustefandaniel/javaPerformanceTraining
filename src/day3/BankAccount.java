package day3;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	private volatile int balance;
	private final ReentrantLock lock = new ReentrantLock();
	
	public BankAccount(int money)
	{
		this.balance=money;
	}
	
	public synchronized void deposit get(int amount) {
		lock.lock();
		while (available == false) {
			try {
				wait();
			}
			finally{
				lock.unlock();
			}
		available = false;
		notifyAll();
		return contents;
	}
	
	
	public synchronized void withdraw(int amount) {
		lock.lock();
		while (lock.isLocked()) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		notifyAll();
	}
	
	public  synchronized int getBalance(){
	        return balance;
	 }
}
