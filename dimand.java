import java.util.Scanner;
public class dimand{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row:");
int row=sc.nextInt();
int mid=row/2;
int rows=1;
for(int i=mid;i>0;i--){
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int j=1;j<=rows;j++){
System.out.print("* ");
}
System.out.println(" ");
rows+=1;
}

for(int i=0;i<=mid;i++){
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int j=rows;j>0;j--){
System.out.print("* ");
}
System.out.println(" ");
rows--;
}
}
}
