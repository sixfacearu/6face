import java.util.*;
public class hashmap {

   public static void main(String args[]) {
            int i;
            Scanner sc=new Scanner(System.in);
      /* This is how to declare HashMap */
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      /*Adding elements to HashMap*/
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Rahul");
      hmap.put(7, "Singh");
      hmap.put(49, "Ajeet");
      hmap.put(3, "Anuj");

     

      /* Get values based on key*/
      do{
      System.out.println("enter the key:");
      int ke=sc.nextInt();
      String var= hmap.get(ke);
      System.out.println(var);
      System.out.println("if you exit prees 0:");
      System.out.println("if you continue prees 1:");
      i=sc.nextInt();
      }while(i!=0);
      

      /* Remove values based on key*/
      hmap.remove(3);
      System.out.println(hmap);

   }
}
