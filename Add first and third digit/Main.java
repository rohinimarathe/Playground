import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    int sec_last_dig = (num % 10)+(num/100);
		System.out.println(sec_last_dig);
	}
}