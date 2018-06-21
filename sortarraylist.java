import java.util.*;
public class sortarraylist{
public static void main(String args[]){
int i=0;
Scanner sc=new Scanner(System.in);
ArrayList<Integer> values=new ArrayList<Integer>();
while(i<5){
int a=sc.nextInt();
values.add(i,a);
i++;}
System.out.println("before Sorting:"+values);
Collections.sort(values);
for(int ii:values){
System.out.println("After Sorting:"+ii);}
}
}

