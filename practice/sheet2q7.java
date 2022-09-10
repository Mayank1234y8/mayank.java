import java.util.Scanner;
class sheet2q7{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the nunber :");
		double p = n.nextDouble();
		if ( p >= 0){
			System.out.print("Absolute value is "+p);
		}
		else{
			p = p*(-1);
			System.out.print("Absolute value is "+p);
		}
}
}