import java.util.Scanner;
class sheet2q8{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the nunber of classes held :");
		double c = n.nextDouble();
		System.out.print("Enter the nunber of classes attended :");
		double a = n.nextDouble();
		double k = (c/a)*100;
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
}