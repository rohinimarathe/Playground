import java.util.Scanner;
class Main{	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int starcount = 1 ; starcount <= num ; starcount++) {
			System.out.print(starcount);
			if((starcount % 3 == 0) && (starcount != num))
    			System.out.print(",");			
		}
	}
}