import java.util.Scanner;
public class array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("how many element you want:");
int length=sc.nextInt();
String[] arr=new String[length];
for(int i=0;i<=length-1;i++){
System.out.println("enter the name:"+(i+1));
String name=sc.next();
arr[i]=name;
}
for(String i:arr){
System.out.println(i);}
}
}



