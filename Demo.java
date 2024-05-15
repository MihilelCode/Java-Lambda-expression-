@FunctionalInterface
interface A{
    int add(int i, int j);
    
}
@FunctionalInterface
interface B{
    int sup(int c,int b);
}
@FunctionalInterface
interface C{
    double div(int p, int q);
}
@FunctionalInterface
interface D{
    double multi(int r, int s);
}
public class Demo{
    public static void main(String a[]){
       A obj= ( i,  j)->  i+j;
       int result= obj.add(12, 45);
       System.out.println("In add result:"+result);

       B obj1=(c,b) -> c-b;
       int result1=obj1.sup(12, 10);
       System.out.println("In Sup result:"+result1);

       C obj2=( p, q) -> p/q;
       System.out.println("In div result:"+obj2.div(12, 4));

       D obj3=( r, s)-> r*s;
       System.out.println("In multi result:"+obj3.multi(45, 2));
    }
}




