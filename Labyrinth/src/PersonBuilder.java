import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PersonBuilder {
    public Person buildPerson(String levelName, Labyrinth labyrinth) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(levelName + "/person"));
            Scanner sc = new Scanner(reader);
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            sc.nextLine();
            String symbol = sc.nextLine();
            reader.close();

            return new Person(startX, startY, symbol.charAt(0), labyrinth);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
