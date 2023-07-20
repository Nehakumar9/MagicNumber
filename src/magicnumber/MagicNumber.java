package magicnumber;

import java.util.Scanner;

public class MagicNumber {

	public static int magicNumber(int num) {
		if(num==0) {
			return 0;
		}
		return magicNumber(num/10)+(num%10);
	}
	public static boolean isMagic(int num) {
		int sum = magicNumber(num);
		if(sum>9) {
			return isMagic(sum);
		}
		else {
			return sum == 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println((isMagic(num)?1:0));
	}

}
