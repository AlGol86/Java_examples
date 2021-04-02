import java.util.Arrays;
import java.util.Objects;

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
//        int a=5;
//        int[] aa={6,7,8,9};
//        int[] bb=aa.clone();
//        System.out.println(Arrays.equals(aa,bb));
String s=null;
String ss=null;

        A a=new A();
        A a1=a.clone();
        System.out.println(s.equals(ss));

    }
}

class A implements Cloneable{

int x=5;
B b=new B();

    @Override
    protected A clone() throws CloneNotSupportedException {
        A ac=(A)super.clone();
        ac.b=b.clone();
        return ac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return x == a.x &&
                Objects.equals(b, a.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, b);
    }
}

class B implements Cloneable{
    int y=100;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof B)) return false;
        B b = (B) o;
        return y == b.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y);
    }

    @Override
    protected B clone() throws CloneNotSupportedException {
        return (B)super.clone();
    }
}