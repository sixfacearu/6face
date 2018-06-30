import java.util.Scanner;
public class arrlogic2{
public static void main(String args[]){
int arr[]={1,2,3,4,5,6,7,8,9};
Scanner sc=new Scanner(System.in);
System.out.println("enter the number you want:");
int num=sc.nextInt();
int i=0;
for(int j=num;j<arr.length;j++){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
}
for(int k:arr){
System.out.print(k);
}
}
}
