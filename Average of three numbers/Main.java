import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
      	int num1 = sc.nextInt();
        int num2 = sc.nextInt();


	    int product = num+num1+num2;
      	int sum=product/3;
		System.out.println(sum);
	}
}