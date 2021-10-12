import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void printSet(HashSet<String> set) {
        for(String str: set) {
            System.out.print(str + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();

        strSet.add("MyStr1");
        strSet.add("MyStr2");
        strSet.add("MyStr3");
        printSet(strSet);

        strSet.add("MyStr3");
        printSet(strSet);
    }
}
