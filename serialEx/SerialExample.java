package serialEx;

import java.io.*;

public class SerialExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ForSerialize fs1=new ForSerialize("ONE");
//        ForSerialize fs2=new ForSerialize("TWO");
//        ForSerialize fs3=new ForSerialize("THREE");
        FileInputStream f=new FileInputStream("serialEx/OutFile");
        ObjectInputStream is=new ObjectInputStream(f);

       ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("serialEx/OutFile"));
       os.writeObject(fs1);
        fs1.a="TWO";
       os.reset();
        os.writeObject(fs1);
//        os.reset();
        os.writeObject(fs1);
//        os.reset();
        System.out.println(is.available());
        while (f.available()>0) {
            ForSerialize fs01=(ForSerialize)is.readObject();
        System.out.println(fs01.a);
        }
//        fs01.print();
//        ForSerialize fs02=(ForSerialize)is.readObject();
//        System.out.println(fs02.a);
//        ForSerialize fs03=(ForSerialize)is.readObject();
//        System.out.println(fs03.a);

    }
}
    class ForSerialize implements Serializable {
      // public static long serialVersionUID=100;
        String a;
        String aa;
        String b="hllo";
        ForSerialize(String x){a=x;}
        void print(){
        System.out.println("PRIMTING");
        }
//        void print(){
//        System.out.println("PRINTING");
//        }

        }