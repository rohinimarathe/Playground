import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      for(int i=0;i<=num*2;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
        }
      }
	}
}