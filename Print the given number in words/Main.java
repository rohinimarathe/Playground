import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      switch(num)
      {
        case 1:if(num==1)
        {
          System.out.println("One");
        }
          break;
        case 2:if(num==2)
        {
          System.out.println("Two");
        }
          break;
         case 3:if(num==3)
         {
          System.out.println("Three");
         }
          break;
		 case 4:if(num==4)
         {
          System.out.println("Four");
        }
          break;
         case 5:if(num==5)
        {
          System.out.println("Five");
        }
          break;
        default:
          {
            System.out.println("Invalid");
          }

      }
	}
}