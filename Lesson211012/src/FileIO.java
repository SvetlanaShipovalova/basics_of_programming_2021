import java.io.*;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("data/test.txt", true));
            out.append("My string 1\n");
            out.append("My string 2\n");
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            InputStreamReader in = new InputStreamReader(new FileInputStream("data/test.txt"));
            Scanner sc = new Scanner(in);
            System.out.println(sc.nextLine());
            System.out.println(sc.nextLine());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
