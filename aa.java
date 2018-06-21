import java.util.*;
public class aa{
public static void main(String args[]){
ArrayList<Integer> obj=new ArrayList<Integer>();
for(int i=0;i<=5;i++){
obj.add(i,i);
}
System.out.println(obj);
Collections.swap(obj,3,4);
System.out.print(obj);
}
}

