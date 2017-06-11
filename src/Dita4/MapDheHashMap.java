package Dita4;

import java.util.HashMap;

import  java.util.Map;

/**
 * Created by erald on 17-06-11.
 */
public class MapDheHashMap {
    static HashMap<String, Boolean> map1= new HashMap<>();

    public static void main (String[] args){
        map1.put("Komp1",true);
        map1.put("komp2",false);

        System.out.println(map1.get("Komp1"));  //Mer vleren koresponduese te Kopmp1

        if (map1.containsKey("Komp1")) System.out.println(1);  // Check if a key exists

        if (map1.containsValue(Boolean.FALSE)) System.out.println(2);  // Check if a value exits in the map

        // Loop throw all keys
        for (String s : map1.keySet()){
            System.out.println(s);
        }
        // Loop throw all values
        for (Boolean b : map1.values()){
            System.out.println(b);
        }
        // Loop throw the keyset
        for (Map.Entry kv : map1.entrySet()){
            System.out.println(kv);
        }
    }

}
