import java.util.Scanner;
class sheet2q11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character :");
		char c = sc.next().charAt(0);
		if ( c >= 'A' && c <= 'Z' )
		{
			System.out.print("Uppercase alphabet.");
		}
		else if ( c >= 'a' && c <= 'z' )
		{
			System.out.print("Lowercase alphabet.");
		}
		else
		{
			System.out.print("Invalid input.");
		}
	}
}