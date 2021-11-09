import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Signal signal = new Signal();

        Scanner sc = new Scanner(System.in);
        int it = sc.nextInt();
        switch (it) {
            case 1 -> signal.post(new RedLampIndicator());
            case 2 -> signal.post(new TextIndicator());
        }
    }
}
