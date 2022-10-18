package JavaFullStack.BasicInJava.exception;

import java.io.IOException;

public class compailtime {

	public static void main(String[] args) throws IOException, InterruptedException {
		// exception is defined by 2 methods 
		// compaile time and runtime 
		// try,catch,finaly,throw,throws 5 methods are solve in error handling
		
		Runtime run = Runtime.getRuntime();// runtime objct index
		Process exc; // process is a keyword
		exc = run.exec("notepad"); // excute the open notepad comand
        exc =run.exec("calc");
        Thread.sleep(1000); // its a decale the time define by miles its means 1000 mile equal to 1 second
        exc = run.exec("notepad");
	}
	

}
