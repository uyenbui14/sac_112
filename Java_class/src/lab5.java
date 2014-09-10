import java.util.Scanner;
public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number1;
		int number2;
		int sum;
		System.out.print ("first interger:");
		number1 = input.nextInt();
		System.out.print ("2nd interger:");
		number2 = input.nextInt();
		sum= number1 + number2;
		System.out.printf("x is  %d  y is %d sum is %d\n", number1, number2, sum);
	}

}
