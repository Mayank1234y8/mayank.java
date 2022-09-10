import java.util.Scanner;
class sheet2q6{
	public static void main(String[] args){
		Scanner age = new Scanner(System.in);
		System.out.print("Enter the age of first person :");
		int a = age.nextInt();
		System.out.print("Enter the age of second person :");
		int b = age.nextInt();
		System.out.print("Enter the age of third person :");
		int c = age.nextInt();
		if( a>b && a>c)
			System.out.println("First person is eldest.");
		else if( b>c)
			System.out.println("Second person is eldest.");
		else
			System.out.println("Third person is eldest.");
		if( a<b && a<c)
			System.out.println("First person is youngest.");
		else if( b<c)
			System.out.println("Second person is youngest.");
		else
			System.out.println("Third person is youngest.");
	}
}