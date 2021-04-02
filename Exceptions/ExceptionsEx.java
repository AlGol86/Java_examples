package Exceptions;


import java.sql.SQLException;

public class ExceptionsEx {
    public static void main(String[] args){
      A(0);

    }
    public static void A(){
        System.out.println("A");
    }
    public static void A(int i) throws NullPointerException {
        System.out.println("A");
    }
    public static int A(int x,int b) throws Exception{
        System.out.println("Ai");
        return 0;
    }
}
