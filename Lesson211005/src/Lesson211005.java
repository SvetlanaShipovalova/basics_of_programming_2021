import java.util.Scanner;

public class Lesson211005 {
    public static int max_3(int a, int b, int c) {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;

        return max;
    }

    public static long fact(int n) {
        if(n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
//        int x1 = 0, x2 = 0, x3 = 0;
//        Scanner sc = new Scanner(System.in);
//
//        x1 = sc.nextInt();
//        x2 = sc.nextInt();
//        x3 = sc.nextInt();
//
//        int max = max_3(x1, x2, x3);
//
//        System.out.println(max);

        int n = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        long res = fact(n);
        System.out.println(res);
    }
}
