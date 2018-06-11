
public class sam {

	    public static void main(String args[]){
	    	int temp;
	    	boolean result=true;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int num=sc.nextInt();
	      for(int i=2;i<=2;i++) {
	    	  temp=num%i;
	        	if(temp==0) {
	        	result=false;
	        	break;
	        }
	      }
	       if(result) {
	    	   System.out.println("its prime number");
	       }
	       else {
	    	   System.out.println("its not prime number");
	       }
	    }
	}

