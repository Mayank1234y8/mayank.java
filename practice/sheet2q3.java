import java.util.Scanner;
class sheet2q3{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the quantity :");
		int q = a.nextInt();
		int m = (q*100);
		if(m >= 1000){
			m = m - (m/10);
			System.out.println("Total cost after discount :"+m);
		}
		else{
			System.out.print("You can not get discount.");
		}
}
}