import java.util.Scanner;
public class arrlogic3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]={1,2,3,4,5,6,7};
System.out.println("enter a posisition you want:");
int pos=sc.nextInt();
int temp=arr[0];
arr[0]=arr[pos];
arr[pos]=temp;
for(int i:arr){
System.out.print(i +" ");
}
}
}

