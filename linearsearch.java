import java.util.Scanner;
public class linearsearch{
public static void main(String args[]){
int size,count,input,item;
Scanner sc=new Scanner(System.in);
System.out.println("how many element you want to push:");
size=sc.nextInt();
int[] arr=new int[size];
for(count=0;count<size;count++){
input=sc.nextInt();
arr[count]=input;
}
System.out.println("enter your data:");
item=sc.nextInt();
for(count=0;count<size;count++){
if(arr[count]==item){
System.out.println("your data" +item+ "is:" +count+ "position");
break;
}
}
if(count==size){
System.out.println("its not a array element");
}
}
}

