import java.util.Scanner;
public class excep{
public static void main(String args[]){
try{
int a=0;
int b=34/a;
System.out.println(a);
}
catch(ArithmeticException e){
System.out.println("never put 0 to divide");
}
catch(Exception e){
System.out.println("normal error");
}
}
}

