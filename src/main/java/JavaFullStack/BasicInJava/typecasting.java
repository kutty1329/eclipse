package JavaFullStack.BasicInJava;

public class typecasting {

	public static void main(String[] args) {
		// 1.widningmethod
           byte a = 10;
           short b = a;
           System.out.println(b);
        //2.narrowingmethod
           double c = 10.8;
           float d =(float)'d';
           System.out.println(d);
           
        // type casting two methods
        //1.widning ------ smaler to large---byte<short<char<int<long<float<double
        //2.narrowinng ---- large to smaler---- double>float>long>int>char>short>byte
	}
   }
