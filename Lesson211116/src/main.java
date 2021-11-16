import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BinarySearchTree<String> root = new BinarySearchTree<>("my string");

        root.insert("test");
        root.insert("break");
        root.insert("integer");

        root.print(0);

        BinarySearchTree<Integer> rootInt = new BinarySearchTree<>(100);

        rootInt.insert(150);
        rootInt.insert(80);
        rootInt.insert(90);
        rootInt.print(0);
        System.out.println();
        rootInt = rootInt.remove(80);
        rootInt.print(0);
        System.out.println();
        rootInt = rootInt.remove(90);
        rootInt.print(0);
        System.out.println();
        rootInt = rootInt.remove(100);
        rootInt.print(0);
        System.out.println();
        rootInt = rootInt.remove(50);
        System.out.println(rootInt);
    }
}
