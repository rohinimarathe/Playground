import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
        Scanner in=new Scanner(System.in);
      int num=in.nextInt();
        int val=1; 
      	for(int row=1;row<=num;row++)
      	{
          for(int space=1;space<=(num-row);space++)
          {
            System.out.print(" ");
          }
     
        for(int col=1;col<=row;col++)
        {
               System.out.print(val+" ");

				val++;
        }


                 System.out.print("\n");

      
      
	}
	
    }    
}