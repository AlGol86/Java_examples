package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics1 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        List<String> list2= new ArrayList<>();
        list2.add("5");

       //print(list2,list); //error
        print(list2,list2);;
        print(list,list);;

       // System.out.println(print(list));
    }
    public static <T> void print(List<? super T> l, List<? extends T> ll){
        System.out.println(l.getClass());

        Map<? super T,String> map=new HashMap<>();
        //map.put(l.get(0),"ok" );

    }
}
