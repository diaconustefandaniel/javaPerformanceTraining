package day3Gabi;


public class ClientThread2 extends Thread
{BankAccount ba;

public void setBankAccount(BankAccount ba)
{
	this.ba = ba;
}

	@Override
	public void run() {
		while (true)
		{
			ba.getBalance();
		}
	}

}
