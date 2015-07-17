package day3Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccountAtomic {

	private final AtomicInteger balance=new AtomicInteger();
	
	public BankAccountAtomic(int balance)
	{
		this.balance.set(balance);
	}
	
	public void deposit(int delta)
	{
		balance.addAndGet(delta);
	}
	
	public void withdraw(int delta)
	{
		balance.addAndGet(-delta);
	}
	
	public int getBalance()
	{
		return balance.intValue();
	}
	
}
