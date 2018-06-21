import java.util.*;
public class arraylist{
public static void main(String args[]){
ArrayList<Integer> obj=new ArrayList<Integer>();//arrray class declare and create object for array list
for(int i=0;i<=5;i++){
obj.add(i,i);//add data in array list
}
System.out.println("begain array:"+obj);
obj.remove(0);//remove data using index value or directly data value obj.remove(100);
System.out.println("after modify:"+obj);
obj.set(0,100);//updating data or replacing data
System.out.println("after updating:"+obj);
int pos=obj.indexOf(100);//find the possition of particular element in the array list
System.out.println("after updating:"+pos);
int value=obj.get(3);//get particular index data from the array
System.out.println("3rd index value is:"+value);
int length=obj.size();//its provide a length of the arraylist
System.out.println("length:"+length);
boolean res=obj.contains(101);//101 is present or not (true means present,false means not present)
System.out.println("101:"+res);
obj.clear();
System.out.println(obj);
}
}
