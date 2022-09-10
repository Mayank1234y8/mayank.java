import java.util.Scanner;
class sheet2q1{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the length :");
		float l = a.nextFloat();
		System.out.print("Enter the breadth :");
		Float b = a.nextFloat();
		if(l == b){
			System.out.println("It is a square.");
		}
		else{
			System.out.print("It is not a square.");
		}
}
}