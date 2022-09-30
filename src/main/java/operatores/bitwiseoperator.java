package operatores;

public class bitwiseoperator {

	public static void main(String[] args) {
		// same as And gate , OR gate but not gate only change the foramte in bitwise operator
		// And gate (&) , OR gate (||) , XOR gate (^)--- its called bitwiseoperator
		
	//	and gate = equal value are same condtion "TRUE"
//	    or gate = either one value corect condtion "TRUE"
//		XOR gate = equal value same condtion "FALSE"
		
//		Truth table
//		XOR Gate(^)
//		a b c
//		1 1 0
//		1 0 1
//		0 1 1
//		0 0 0
		
		int a = 150;
		int b = 25;
		int c = 50;
		
		System.out.println((b<a)^(b<c));
		System.out.println((a<b)^(c<a));
		System.out.println((a<c)^(b>a));

	}

}
