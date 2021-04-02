public class LikeEnum  extends Enum1<LikeEnum> {

    private static int cnt;

    public static final LikeEnum A1, A2, A3;

    static{
        A1=new LikeEnum("A1");
        A2=new LikeEnum("A2");
        A3=new LikeEnum("A3");

    }

    private LikeEnum(String name){
        super(name,cnt++);
    }

    ////methods in LikeEnum

}


abstract class Enum1<E extends Enum1<E>> implements Comparable<E> {

    public final String  name;
    private final int     ordinal;

    protected Enum1(String name, int ordinal){
        this.name=name;
        this.ordinal=ordinal;
    }
    public final int ordinal() {
        return ordinal;
    }
    public String toString() {
        return name;
    }
    public final boolean equals(Object other) {
        return this==other;
    }
    public final int hashCode() {
        return super.hashCode();
    }
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public final int compareTo(E o) {
        Enum1<?> other = (Enum1<?>)o;
        Enum1<E> self = this;
        if (self.getClass() != other.getClass() && // optimization
                self.getDeclaringClass() != other.getDeclaringClass())
            throw new ClassCastException();
        return self.ordinal - other.ordinal;
    }
    @SuppressWarnings("unchecked")
    public final Class<E> getDeclaringClass() {
        Class<?> clazz = getClass();
        Class<?> zuper = clazz.getSuperclass();
        return (zuper == Enum1.class) ? (Class<E>)clazz : (Class<E>)zuper;
    }
    ////methods of java.lang.Enum

}
