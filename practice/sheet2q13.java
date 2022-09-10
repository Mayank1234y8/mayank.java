import java.util.Scanner;
class sheet2q13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your gender :");
		char g = sc.next().charAt(0);
		System.out.print("Enter your marital status :");
		char m = sc.next().charAt(0);
		System.out.print("Enter your age :");
		int a = sc.nextInt();
		if ( g == 'M' && m == 'Y' && ( a >= 20 && a < 40 ))
		{
			System.out.print("He can work anywhere.");
		}
		else if ( g == 'M' && m == 'Y' && ( a >= 40 && a < 60 ))
		{
			System.out.print("He can work in urban areas only.");
		}
		else if ( g == 'F' && m == 'Y' && ( a >= 20 && a < 60 ))
		{
			System.out.print("She can work in urban areas only.");
		}
		else
		{
			System.out.print("ERROR");
		}
	}
}