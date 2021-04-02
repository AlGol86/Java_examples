package enums;


import java.util.Locale;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EnumEx {
    public static void main(String[] args) {

        double a = 5, b = 10;
        for (Operation op : Operation.values()) {
            System.out.printf(Locale.US, "%f %s %f = %f%n", a, op, b, op.apply(a, b));
        }
        Integer x =null;

        System.out.println(Optional.ofNullable(x).orElse(100));

    }


}


enum Operation {
    PLUS('+') {
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS('-') {
        public double apply(double a, double b) {
            return a - b;
        }
    };
    private final char c;

    Operation(char c) {
        this.c = c;
    }

    public abstract double apply(double a, double b);

    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).
                    collect(Collectors.toMap(Object::toString, e -> e));

    public static Optional<Operation> fromString(String symb){
        return Optional.ofNullable(stringToEnum.get(symb));
    }

    @Override
    public String toString() {
        return "Operation{" +
                "c=" + c +
                '}';
    }
}

enum ABC {
    A, B, C;

    ABC() {
        System.out.println(b);
    }

    static int a;
    static final int b = 100;
}
