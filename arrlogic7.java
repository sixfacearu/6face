import java.util.Scanner;
public class arrlogic7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rotation you want:");
int rot=sc.nextInt();
int root=rot;
int[] arr={1, 3, 5, 7, 9};
for(int j=0;j<arr.length;j++){
if(rot<arr.length){
int temp=arr[rot];
arr[rot]=arr[j];
arr[j]=temp;
}
if(rot>arr.length){
rot=0;
}
}
for(int i:arr){
System.out.print(i);
}
}
}
