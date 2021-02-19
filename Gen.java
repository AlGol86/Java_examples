import java.util.Arrays;

public class Gen {
    public static void main(String[] args) {

        A<Integer> a1 = new A<>(10);
        a1.print(5);
        a1.print(6);
A<? > a2=new A<>(10.67);

        System.out.println(a2.sup().getClass());
       // a2.setUi(7L);
        System.out.println(a2.sup().getClass());
//Number l=a2.sup();
    }
}
class A<T>{
T ui;
A(T t){ui=t;}
 void print(T t)  {
     System.out.println(t);

 }
 void setUi(T t){ui=t;}
 T sup(){
    return ui;
 }
}


