import java.util.*;
public class linkedlist{
public static void main(String args[]){
LinkedList<Integer> obj=new LinkedList<Integer>();
obj.add(1);
obj.add(2);
obj.add(3);
System.out.println(obj);//add element into the list
obj.addFirst(10);
obj.addLast(20);
System.out.println(obj);
obj.remove(1);
System.out.println(obj);
System.out.println(obj.indexOf(20));
}
}

