import java.util.Scanner;
class sheet2q4{
	public static void main(String[] args){
		Scanner m = new Scanner(System.in);
		System.out.print("Enter the salary :");
		int s = m.nextInt();
		System.out.print("Enter the year of service :");
		int y = m.nextInt();
		double b;
		if( y > 5){
			b = (s/20);
			System.out.print("You get a bonus of Rs."+b);
		}
		else{
			System.out.print("You are not eligible for bonus.");
		}
}
}