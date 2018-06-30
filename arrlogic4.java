import java.util.Scanner;
class search{
  void binary(){
     Scanner sc=new Scanner(System.in);
      int arr[]={1,2,3,4,5,6,7,8,9};
      System.out.println("enter the data:");
      int data=sc.nextInt();
      for(int i=0;i<arr.length;i++){
        if(arr[i]==data){
         System.out.println("position of data is:" +i);
        }
	}
}
  void linear(){
      Scanner sc=new Scanner(System.in);
      int arr[]={1,2,3,4,5,6,7,8,9};
      System.out.println("enter the data:");
      int data=sc.nextInt();
      int middle=arr.length/2;
    for(int i=0;i<=arr.length-1;i++){
        if(arr[middle]>data){
         middle=middle-=1;
        }else if(arr[middle]==data){
       
    System.out.println("position is"+middle);
     break;
        }
        else if(arr[middle]<data){
            middle=middle+=1;
        }
        
        }
}
}

public class arrlogic4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
search obj=new search();
System.out.println("press 1 to linear search:");
System.out.println("press 2 to Binary search:");
int opt=sc.nextInt();
switch(opt){
case 1:obj.binary();
       break;
case 2:obj.linear();
       break;
default :System.out.println("not a valid option:");
}
}
}
