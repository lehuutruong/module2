package ss12_collection_framework.practice.diffrent_of_hashmap_hashset;

import java.util.HashMap;
import java.util.Map;

public class MainController {
    public static void main(String[] args) {
        Student student1=new Student("mập",20,"lào");
        Student student2=new Student("tobi",22,"campuchia");
        Student student3=new Student("thanh hẻ",24,"đông ti mo");
        Student student4=new Student("a giàng",27,"prom penh");
        Map<Integer,Student> studentMap=new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student3);
        studentMap.put(4,student2);
        studentMap.put(3,student4);
        for (Map.Entry<Integer, Student> item:studentMap.entrySet()
             ) {
            System.out.println(student1.toString());

        }
    }
}
