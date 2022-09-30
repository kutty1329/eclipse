package operatores;

public class logicaloperator {

	public static void main(String[] args) {
		// And ($) or(|) not (!)--- its called logical operator
		
//		and gate = equal value are same condtion "TRUE"
//		or gate = either one value corect condtion "TRUE"
//		not gate = opostie value "TRUE VALUE FALSE"
//		
//		truth table
//		AND (*)       OR(+)       NOT(opostie)
//		a b c        a b c        a b
//		1 0 0       1 0 1         1 0
//		0 1 0       0 1 1         0 1
//		1 1 1       1 1 1
//		0 0 0       0 0 0
		
		int a = 100;
		int b = 50;
		int c = 10;
		
		System.out.println((b<a)&(b>c));
		System.out.println((a>c)||(a<b));
		System.out.println(!(a<b));

	}

}
