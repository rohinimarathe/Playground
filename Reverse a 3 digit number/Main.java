import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int firstno,lastno,secondno,reverse;
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    firstno=num/100;
    secondno=((num/10)%10);
    lastno=num%10;
    reverse=(lastno*100)+(secondno*10)+firstno;
    System.out.println(reverse);
  }
}