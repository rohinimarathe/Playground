import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
     int search=in.nextInt();
     int search1=in.nextInt();
     int index=-1;
     int index1=-1;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(search==arr[i])
        {
          index=i;
        }
      }
       for(int i=0;i<=arr_size-1;i++)
      {
        if(search1==arr[i])
        {
          index1=i;
        }
  
    }
      System.out.println(index);
	  System.out.println(index1);
      
}
}