import java.util.Scanner;
class sheet2q12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year :");
		int y = sc.nextInt();
		if (( y%400 == 0) || ( y%4 == 0 && y%100 != 0 ))
		{
			System.out.print("It is a leap year.");
		}
		else
		{
			System.out.print("It is not a leap year.");
		}
	}
}