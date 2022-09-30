package JavaFullStack.BasicInJava.controlstatement;

import java.util.Scanner;

public class projectofcontrolstatement {

	public static void main(String[] args) {
	Scanner television = new Scanner(System.in);
	int money = 15000;
	System.out.println("WELCOME TO MY SHOWROOM");
	System.out.println("HAI SIR PLEAE TELL US WHAT YOU WANT SIR");
	String types = television.nextLine();
	System.out.println("HAI SIR SO MANYBRANDS ARE AVAILABLE IN MY SHOWROOM SIR,LG,SONY,MI,ONEPLUS,SAMSUNG,");
	
	String TV = television.nextLine();
	
	switch(TV)
	
	{
	case "LG":
		System.out.println("A billion shades of Colour for impeccable picture and Dolby Atmos for Enhanced Sounds. Powerful AI Processor optimizes your content and sound for Maximum Immersiveness. LG OLED evo. Types: LG SIGNATURE OLED, OLED evo, Smallest OLED, Biggest OLED.");
	if(money>=30000|money<=50000)
	      {
			int price = television.nextInt();
			System.out.println(price +"THIS PRICE ARE AVAILABLE IN LG SIR");
		  }
	else
	{
		System.out.println("THANKS FOR VISITING LG TV");
	}
	break;		
	case "SONY" :
		
		System.out.println("Discover Sony's BRAVIA 4K Ultra HD TV X75K with 4K Processor X1 and 4K X-Reality PRO. Enjoy 700000+ movies and TV episodes with Google TV.\r\n"
				+ "");
	 if((money<45000)&(money<=75000))
	{
		int price = television.nextInt();
		System.out.println(price + "THIS PRICE IS AVAILABLE ON SONY TV ");
	}
	 else
		{
			System.out.println("THANKS FOR VISITING SONY TV");
		}
		break ;
case "MI" :
		
		System.out.println("Buy Mi LED TV at India's Best Online Shopping Store. Choose from a wide range of mi smart television. ✓Best Deals ✓COD ✓Fast Shipping."+ "");
	 if((money<15000)&(money<=50000))
	{
		int price = television.nextInt();
		System.out.println(price + "THIS PRICE IS AVAILABLE ON MI TV ");
	}
	 else
		{
			System.out.println("THANKS FOR VISITING MI TV");
		}
		break ;
case "ONEPLUS" :
	
	System.out.println("Online shopping for OnePlus TV from a great selection at Electronics Store. ... Sliding Soundbar Q1 Series 4K Certified Android QLED TV 55Q1IN Pro (Black).\r\n"
			+ "");
 if((money<25000)&(money<=50000))
{
	int price = television.nextInt();
	System.out.println(price + "THIS PRICE IS AVAILABLE ON ONEPLUS TV ");
}
 else
	{
		System.out.println("THANKS FOR VISITING ONEPLUS TV");
	}
	break ;
case "SAMSUNG" :
	
	System.out.println("Samsung brings TVs like HD TV, The Frame TV, Full HD TV, 4K UHD TV, QLED 8K TV, QLED 4K TV, Curved TV, Smart TV with latest technology");
 if((money>15000)||(money<=80000))
{
	int price = television.nextInt();
	System.out.println(price + "THIS PRICE IS AVAILABLE ON SAMSUNG TV ");
}
 else
	{
		System.out.println("THANKS FOR VISITING SAMSUNG TV");
	}
	break ;
	default : System.out.println("THANKS FOR COMING MY SHOWROOM");
	}
	
	}

}
