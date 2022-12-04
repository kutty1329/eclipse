package JavaFullStack.BasicInJava;

public class typecasting {

	public static void main(String[] args) {
		// 1.widningmethod
           byte a = 10;
           short b = a;
           float e=b;
           System.out.println(b);
           System.out.println(e);
        //2.narrowingmethod
           double c = 10.8d;
           float d =(float)c;
           int i=(int)d;
           System.out.println(d);
           System.out.println(i);
           
        // type casting two methods
        //1.widning ------ smaler to large---byte<short<char<int<long<float<double
        //2.narrowinng ---- large to smaler---- double>float>long>int>char>short>byte
	}
   }
