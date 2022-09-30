package operatores;

public class shiftoperator {

	public static void main(String[] args) {
		// >> --- [a/2^b]
		// <<-----[a*2^b]
		// its called shift operator
		
		int a = 10;
		int b = 5;
		a<<=b;//{10*(2^5)}=(10*32=320)
		a>>=b;//{10/2^5}=(10/32=0)
// the importent note which value assigned for a last value that value get it next assigned
//example the condtion value is (a>>=b) 0 but assigne valu is 10
// defination {320/2^5}=(320/32=10}
		
		System.out.println(a<<=b);
		System.out.println(a>>=b);

	}

}
