import java.util.Scanner;

public class array {
    public static void main2(String[] args) {
        // <type>[] <name> [= <init>];
        // <type> <name>[] [= <init>]; - не используем
//        int[] iArr; // null
//        int iArr2[];
//
//        float[] fArr = { 1, 2, 3, 4, 5 };
//        double[] dArr = new double[100];
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] data = new int[count];
        for(int i = 0; i < data.length; ++i) {
            data[i] = sc.nextInt();
        }
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if(max < data[i])
                max = data[i];
        }
        System.out.println(max);
        for (int datum : data) {
            if (max < datum)
                max = datum;
        }
    }
}
