package JavaFullStack.BasicInJava.exception;

import java.io.IOException;

public class democompailtime {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
       Runtime run = Runtime.getRuntime();
       Process pro;
       pro = run.exec("notepad");
       pro=run.exec("calc");
       Thread.sleep(1000);
       pro=run.exec("calc");
	}

}
