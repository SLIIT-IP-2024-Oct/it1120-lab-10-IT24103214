import java.util.Scanner;
public class IT24103214Lab10Q1 {
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the mark(0-100)");
		int mark = input.nextInt();
		
		assert(mark >=0 && mark<=100):"Inavalid Marks";
		
		System.out.println();
		System.out.println("Mark is validated");
	}
}
