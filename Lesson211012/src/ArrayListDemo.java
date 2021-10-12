import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void printList(ArrayList<String> list) {
        for(int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

//    public static boolean predicate(String str) {
//        return str.toLowerCase().contains("my");
//    }

    public static int comparator(String s1, String s2) {
        if(s1.length() == s2.length()) return 0;
        if(s1.length() < s2.length()) return -1;
        return 1;
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        strList.add("My string 1 dfg");
        strList.add("My string 2 we");
        strList.add("My string 1 asf");
        printList(strList);

        strList.set(1, "My string 3lddsd");
        printList(strList);

        // strList.set(2, "Error");
        strList.add(1, "My string 4 s");
        printList(strList);

//        strList.add(4, "My string 4");
//        printList(strList);
        ArrayList<String> strList2 = new ArrayList<>();
        strList2.add("New string 1 ds");
        strList2.add("New string 2 sssfdf");

        strList.addAll(1, strList2);
        printList(strList);

        if(strList.contains("My string 10")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(strList.indexOf("My string 1"));
        System.out.println(strList.lastIndexOf("My string 1"));

        if(strList.remove("My string 10")) {
            System.out.println("remove OK");
        } else {
            System.out.println("not found");
        }
        printList(strList);

//        System.out.println("Remove: " + strList.remove(1));
//        printList(strList);

//        if(strList.removeAll(strList2)) {
//            System.out.println("remove all OK");
//        } else {
//            System.out.println("remove all error");
//        }
//        printList(strList);

//        strList.removeIf(ArrayListDemo::predicate);
//        strList.removeIf(s -> s.toLowerCase().contains("my"));
//        printList(strList);
//        strList.sort(ArrayListDemo::comparator);
//        printList(strList);
//        ArrayList<int> list = new ArrayList<int>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
    }
}
