import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LabyrinthBuilder {
    public Labyrinth buildLabyrinth(String levelName) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(levelName + "/labyrinth"));
            Scanner sc = new Scanner(reader);
            int lines = sc.nextInt();
            sc.nextLine();
            String wall = sc.nextLine();
            String floor = sc.nextLine();
            String exit = sc.nextLine();
            char[][] cells = new char[lines][];
            for(int i = 0; i < lines; ++i) {
                String line = sc.nextLine();
                cells[i] = line.toCharArray();
            }
            reader.close();

            return new Labyrinth(cells, wall.charAt(0), floor.charAt(0), exit.charAt(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
