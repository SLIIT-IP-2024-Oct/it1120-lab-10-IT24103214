import java.util.Scanner;
public class IT24103214Lab10Q1 {
	public static void main(String[]args){
		
		
		//Create a scanner object for input
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the mark(0-100)");
		int mark = input.nextInt();
		
		//First assertion - to check if the mark is in the valid range
		assert(mark >=0 && mark<=100):"Inavalid Marks";
		
		System.out.println();
		System.out.println("Mark is validated");
	}
}
