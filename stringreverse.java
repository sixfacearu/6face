package pak;
import java.util.Scanner;

public class sam {

	    public static void main(String args[]){
	    	String original=" ";
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String a=sc.next();
	        int length=a.length();
	    
	        for(int i=length-1;i>=0;i--) {
	        	original=original+a.charAt(i);
	        	
	        }
	        System.out.print(original);
	    }
	}



