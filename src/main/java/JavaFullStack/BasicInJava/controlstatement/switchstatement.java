package JavaFullStack.BasicInJava.controlstatement;

public class switchstatement {

	public static void main(String[] args) {
		// same for nested if statement but something difrent
		// use break staement the condtion will apply not check the nxt loop 
		
		int value = 5;
		String name = "PRADEEP";
		switch (value)
		{
		case  1:
			System.out.println("THE NUMBER IS ONE");
			break ;
		case  2:
			System.out.println("THE NUMBER IS TWO");
			break ;
		case 3 :
			System.out.println("THE NUMBER IS THREE");
			break ;
		case  4:
			System.out.println("THE NUMBER IS FOURE");
			break ;
		case  5 :
			System.out.println("THE NUMBER IS FIVE");
			break ;
			
			default :System.out.println("THANK YOU VISIT AGAIN");
		}
		switch (name)
		{
		case  "TIWIN":
			System.out.println("I AM TIWIN");
			break ;
		case  "THILAK":
			System.out.println("I AM THILAK");
			break ;
		case "GANESH" :
			System.out.println("I AM GANESH");
			break ;
		case  "ASWIN":
			System.out.println("I AM ASWIN");
			break ;
		case  "PRADEEP":
			System.out.println("I AM PRADEEP");
			break ;
			
			default :System.out.println("THANK YOU VISIT AGAIN");
		}

	}

}
