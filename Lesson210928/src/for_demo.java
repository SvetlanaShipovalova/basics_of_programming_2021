import java.util.Scanner;

public class for_demo {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int start = sc.nextInt();
        int end = sc.nextInt();

//        for(int i = start; i < end; ++i) {
//            System.out.println(i);
//        }

        //for(<init>; <cond>; <upd>)
        //  <statement>

//        for (int i = end; i >= start; i--) {
//            System.out.println(i);
//        }
//        for(int i = start; i <= end; i += 2)
//            System.out.println(i);

//        for(int i = 1, j = start; j <= end; j += i, i++){
//            System.out.println(j);
//        }
        // f0 = 0, f1 = 1, fn = f(n-1) + f(n-2)
        System.out.println(0);
        System.out.println(1);
        for (int f2 = 0, f1 = 1, fn = 1; fn <= end; f2 = f1, f1 = fn, fn = f1 + f2) {
            System.out.println(fn);
        }
    }
}
