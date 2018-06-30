import java.util.Scanner;
public class arrlogic6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("how many element you want:");
int size=sc.nextInt();
int sum=0,total=0,temp=0,totalsum=0;
int arr[]=new int[size];
System.out.println("push the element you want:");
for(int i=0;i<size;i++){
int ele=sc.nextInt();
arr[i]=ele;
}
System.out.println("\n before decending order sort:");
for(int k:arr){
System.out.print(k +" ");
}
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("after asending order sort:");
for(int z:arr){
System.out.print(z +" ");
}
for(int i=0;i<arr.length;i++){
sum=arr[i]*i;
total+=sum;
}
System.out.println("sum of the arr is index:" +total);
for(int i=0;i<arr.length;i++){
totalsum=totalsum+arr[i];
}
System.out.println("sum of the arr is:"+totalsum);
}

}
