package ss12_collection_framework.practice.hashmap_linkedhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainController {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("mập",10);
        hashMap.put("giang ca",20);
        hashMap.put("việt nam",30);
        hashMap.put("namper",40);
        hashMap.put("sơn tobi",50);
        System.out.println(hashMap+"\n");
        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println(treeMap);
    }
}
