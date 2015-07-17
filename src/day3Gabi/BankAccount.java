package day3Gabi;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BankAccount {
	private int balance;
	ReadWriteLock lock = new ReentrantReadWriteLock();

	public  void updateBalance(int amount) {
		try {

			lock.writeLock().lock();

			balance += amount;
			
			System.out.println("updating amount with: " + amount);

		} finally {

			lock.writeLock().unlock();
		}
	}

	public  int getBalance() 
	{
		try {

			lock.readLock().lock();
			System.out.println("balance = " + balance);

			return balance;

		} finally {

			lock.readLock().unlock();
		}
	}

}
