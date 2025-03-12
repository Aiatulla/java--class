package Generics;

import java.util.HashMap;

public class Map<K,V> {

    private HashMap<K,V> m;

    public Map(HashMap<K,V> map){
        m = map;
    }

    public void display(){
        for (HashMap.Entry<K,V> el : m.entrySet()){
            System.out.println("Key: " + el.getKey() + " Value: " + el.getValue());
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aiatulla", 19);
        map.put("Beknur",18);

        Map m = new Map(map);
        m.display();
    }

}


