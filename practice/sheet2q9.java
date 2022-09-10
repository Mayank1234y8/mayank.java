import java.util.Scanner;
class sheet2q9{
	public static void main(String[] args){
		Scanner m = new Scanner(System.in);
		System.out.print("Enter the nunber of classes held :");
		double c = m.nextDouble();
		System.out.print("Enter the nunber of classes attended :");
		double a = m.nextDouble();
		System.out.print("Enter you have medical or not :");
		char s = m.next(). charAt (0);
		double k = (a/c)*100;
		if ( s == 'n')
		{
			if ( k >= 75)
			{
				System.out.println("Your attendance is "+k+" %");
				System.out.print("You are eligible for examination.");
			}
			else
			{
				System.out.println("Your attendance "+k+" %");
				System.out.print("You are not eligible for examination.");
 			}
		}
		else
		{
			System.out.print("You are eligible for examination.");
		}
	}
}