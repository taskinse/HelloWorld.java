package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class _05_Maps {
    public static void main(String[] args) {
        HashMap<String, String> map=new HashMap<>();

        //it is mixed in hasMap
        //if you use linkedhasmap{IL=Illinois, WI=Wisconsin, CA=abc, null=xxx, A=null, B=null, C=null}
        map.put("IL", "Illinois");
        map.put("WI", "Wisconsin");
        map.put("CA", "California");
        map.put("CA", "abc");
        map.put(null, "xxx");
        map.put("A", null);
        map.put("B", null);
        map.put("C", null);
        /*
        key Value
        IL  Illinois
        WI  Wisconsin
        CA  California

        1   Vlad
        2   Andrii
        3   Filiz
        4   Vlad
        keys should always be unique, values can be duplicated.

        1   10
        2   2
        key and value can be any datatype

        Altay   [Valentina, Aya, Bashar] collection
         */
        System.out.println(map.size());
        System.out.println(map);//{null=xxx, A=null, WI=Wisconsin, B=null, IL=Illinois, C=null, CA=abc}
    }
}
