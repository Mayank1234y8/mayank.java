import java.util.Scanner;
class sheet2q2{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int l = a.nextFloat();
		System.out.print("Enter the second mumber :");
		int b = a.nextFloat();
		if( l > b)
		{
			System.out.print(l+" is greater.");
		}
		else if( b > l)
		{
			System.out.print(b+" is greater.");
		}
		else
		{
			System.out.print("Both are equal.");
		}
	}
}