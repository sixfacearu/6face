import java.util.Scanner;
public class k{
public static void main(String args[]){
int kk=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the word you want:");
String word=sc.next();
int length=word.length();
char[] arr=new char[length];
for(int i=0;i<=arr.length-1;i++){
arr[i]=word.charAt(i);
kk++;
}
for(int i=kk-1;i>=0;i--){
for(int j=kk-1;j>=0;j--){
if(i==j){
System.out.print(arr[i]);
}
else if((i+j)==kk-1){
System.out.print(arr[i]);}
else{System.out.print(" ");}
}
System.out.println(" ");
}
}
}


