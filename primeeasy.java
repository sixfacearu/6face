import java.util.Scanner;
public class primeeasy

{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int input=sc.nextInt();
	    int count=0;
	    for(int i=1;i<=10;i++){
	    if(input%i==0){
	        count++;
	    }
	    }
	    if(count==2){
	        System.out.println("given number is prime number");
	    }
	    else{
	        System.out.println("given number is not prime number");
	    }
		
	}
}
