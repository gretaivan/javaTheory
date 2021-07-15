package theory;
/*
 * Two types of exceptions 
 * RunTime java.RunTimeException
 * Compiler java.lang.Exceptions
 * 
 * 
 * Common Exceptions:  ArithmeticExceptions classNotFoundException IllegalArgumentException IndexOutOfBounds InputMismatchException IOException
 * 
 * 
 * */
import java.util.*;
import java.io.*; 

public class JavaExceptions {
	
	public static Scanner in = new Scanner(System.in) ;
	
	public static void main(String [] args) {
		
		System.out.println("1. Division by 0 ");
		divideByZero(2); 
		
		
		System.out.println("2. Input handling");
		System.out.println("How old are you? "); 
		int age = checkValidAge();
		 
		System.out.println("3. File opening");
		
		getFile("./somestuff.txt");
		
		System.out.println("4. Demands the called method catch");
		
		try {
			getFileThrow("./somestuff.txt");
		} catch (IOException e) {
			System.out.println("IO error occured, throw caught");
		}
	}

	private static void divideByZero(int i) {	
		try {
			System.out.println(i / 0);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by 0");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			
			e.printStackTrace(); 
		}
	}
	
	public static int checkValidAge() { 
		try {
			return in.nextInt();
		} catch (InputMismatchException e) {
			in.next(); 
			System.out.println("incorrect input, provide integer");
			return 0;
		}
	}
	
	
	private static void getFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName); 
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) { // catch double or multiple exceptions
			System.out.println("Unknown IO Error");
		} catch (Exception e) {
			System.out.println("I catch all errors");
		}
	}
	
	private static void getFileThrow(String fileName) throws IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName); 
	}
	
}