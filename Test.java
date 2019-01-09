import java.io.*;
class Test {
	public static void main(String[] args) {
		Console c=System.console();
		System.out.println("Enter your name");
		String i = c.readLine();
		System.out.println("Welcome" + i);
	}
}
