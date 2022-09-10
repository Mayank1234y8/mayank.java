import java.util.Scanner;
class sheet2q5{
	public static void main(String[] args){
		Scanner m = new Scanner(System.in);
		System.out.print("Enter the marks :");
		float s = m.nextFloat();
		if( s >= 80 && s < 100){
			System.out.print("You have got A grade.");
		}
		else if( s >= 60 && s < 80){
			System.out.print("You have got B grade.");
		}
		else if( s >=50 && s < 60){
			System.out.print("You have got C grade.");
		}
		else if( s >=45 && s < 50){
			System.out.print("You have got D grade.");
		}
		else if( s >=25 && s < 45){
			System.out.print("You have got E grade.");
		}
		else{
			System.out.print("You get failed.");
		}
}
}