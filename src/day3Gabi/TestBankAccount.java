package day3Gabi;

public class TestBankAccount 
{
	static BankAccount ba = new BankAccount();
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
