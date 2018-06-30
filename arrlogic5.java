import java.util.Scanner;
public class arrlogic5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] arr={23,4,12,122,56,7,9,45};
System.out.println("enter the sum value you want:");
int sum=sc.nextInt();
for(int i=0;i<arr.length;i++){
for(int j=1;j<arr.length;j++){
if(arr[i]+arr[j]==sum){
System.out.println("pair is:"+arr[i]);
break;
}
}
}
}
}
