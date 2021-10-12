import java.util.HashMap;

public class HashMapDemo {
    public static void printMap(HashMap<String, Integer> map) {
        System.out.println("{");
        for(String key: map.keySet()) {
            System.out.println("\t" + key + ": " + map.get(key));
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        printMap(map);

        map.put("Three", 5);
        printMap(map);

        map.remove("Two");
        printMap(map);

        if(map.remove("One", 1)) {
            System.out.println("Remove OK");
        } else {
            System.out.println("Remove error");
        }
        printMap(map);

        if(map.containsKey("One")) {
            System.out.println("key One exist");
        } else {
            System.out.println("key One not exist");
        }

        if(map.containsValue(1)) {
            System.out.println("value 1 exist");
        } else {
            System.out.println("value 1 not exist");
        }
    }
}
