package pak;
import java.util.Scanner;

class sam {
	       private int accountnumber;
	       private int balance;
	       public void deposite(int amount) {
	    	   if(amount>0) {
	    		   balance=balance+amount;
	    		   System.out.println(balance);
	    	   }else {
	    		    System.out.println("invalid amount");
	    	   }
	       }

	    public static void main(String args[]){
	    	sam obj=new sam();
	    	obj.deposite(-100);
	    }
	}



