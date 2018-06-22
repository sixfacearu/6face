import java.util.*;
public class haseset{
public static void main(String args[]){
//hase set only allow original data not dublicate
HashSet<String> hassett=new HashSet<String>();
Scanner sc=new Scanner(System.in);
int i=0;

while(i<=5){
String name=sc.next();
hassett.add(name);
i++;
}
//hashset only allow single null value its allow but return only one
hassett.add(null);
hassett.add(null);
hassett.add(null); 
System.out.println(hassett);
hassett.clear();//delet all element inside hasset
}
}

