
public class ExceptionExample {

	public static void main(String[] args) {
		
		System.out.println(new NullPointerException().equals(new NullPointerException()));
		System.out.println(new NullPointerException()==new NullPointerException());
		
		
		NullPointerException npe1 = new NullPointerException();
		NullPointerException npe12= npe1;
		npe1 = new NullPointerException();
		System.out.println(npe1.equals(npe12));
		String a=null;
		String b=null;
		try{
			a.length();
		}catch(NullPointerException npe)
		{
			System.out.println(npe);
			try{b.length();
			}catch(NullPointerException npe2)
			{
				System.out.println(npe.toString());
			}
		}

	}

}
