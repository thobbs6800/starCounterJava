import java.util.Scanner;
public class PrintStarsHobbs {
	public static void main(String[] args)
	
	//Ty Hobbs
	{
		int counter = 1; 
		
		Scanner in =new Scanner (System.in);
		//Ask the number of lines the user wants
		System.out.println("How lines of printed stars/dashes would you like? ");
		int numberOfLines =in.nextInt();
		
		do{
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			counter ++;
		
		}while(counter <=numberOfLines);
		System.out.println("End of Project");
		in.close();
		
	}
}
