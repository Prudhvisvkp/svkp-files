package svkp;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3="Greetings";
		String s4= new String ("Greetings");
		String s5="Hello World";
		if(s3==s4) // == compare address or reference
		{
			System.out.println("Reference pointing to the same object");
			
		}
		else
		{
			System.out.println("Reference pointing to the Different object");
		}
	}
}
			
			
			
		
		
	


