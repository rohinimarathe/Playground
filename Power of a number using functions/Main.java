import java.util.Scanner;
class Main{
  public static int expo(int number, int exponent)
  {
    int n=number;
    for(int i=1;i<exponent;i++)
    {
      n=n*number;
      
    }
    return n;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num1=in.nextInt();
      int exp=expo(num,num1);

      System.out.print(exp);
      
	}
}