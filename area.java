class areax{
void areas(float a){
System.out.println("squre area is:" +Math.pow(a,2));
}
void areas(float a,float b){
System.out.println("Rectangle area is:" +a*b);
}
void areas(double a){
double c=3.14*a*a;
System.out.println("Circle area is:"+c);
}
}
class area{
public static void main(String args[]){
areax obj=new areax();
obj.areas(5);
obj.areas(11,12);
obj.areas(2.5);
}
}

