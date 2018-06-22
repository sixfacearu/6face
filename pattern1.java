import java.util.Scanner;
public class pattern1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row you want:");
int rows=sc.nextInt();
for(int i=1;i<=rows;i++){
for(int j=1;j<i+1;j++){
System.out.print(j);
}
System.out.println(" ");
}
}
}
