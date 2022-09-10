import java.util.Scanner;
class sheet2q14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a four digit number :");
		int n = sc.nextInt();
		int i = 0,s = 0,r = 0;
		for (i = 0;i < 4;i ++ )
		{
			r = n%10;
			s = ( s*10 ) + r;
			n = ( n/10 );
		}
		System.out.print("Number after reversing :"+s);
	}
}