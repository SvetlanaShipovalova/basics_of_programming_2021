import java.io.IOException;
import java.util.Scanner;

public class labyrinth_1 {
    public static void main(String[] args) {
        String[] labyrinth = {
                "#############X#####",
                "#.........#.......#",
                "#..########..#....#",
                "#.........#..#....#",
                "#.........#..#....#",
                "#.........#..#....#",
                "#.........#######.#",
                "#...#######.......#",
                "#.................#",
                "#...###############",
                "#.....#......#....#",
                "#.....#......#....#",
                "#.....#...######..#",
                "#####.#...........#",
                "#.....#.....#.....#",
                "###...###########.#",
                "#.................#",
                "###################"
        };

        int curLine = 10;
        int curCol = 11;
        char person = '@', wall = '#', floor = '.', exit = 'X';
        Scanner sc = new Scanner(System.in);

        while (labyrinth[curLine].charAt(curCol) != 'X') {
//            try {
//                Runtime.getRuntime().exec("cls");
//            } catch (IOException e) {}

            for (int line = 0; line < labyrinth.length; ++line) {
                for (int col = 0; col < labyrinth[line].length(); col++) {
                    if (line == curLine && col == curCol)
                        System.out.print(person);
                    else
                        System.out.print(labyrinth[line].charAt(col));
                }
                System.out.println();
            }
            System.out.print("Command> ");
            String command = sc.next();
            switch (command) {
                case "w":
                    if(labyrinth[curLine - 1].charAt(curCol) != wall)
                        curLine--;
                    break;
                case "s":
                    if(labyrinth[curLine + 1].charAt(curCol) != wall)
                        curLine++;
                    break;
                case "a":
                    if(labyrinth[curLine].charAt(curCol - 1) != wall)
                        curCol--;
                    break;
                case "d":
                    if(labyrinth[curLine].charAt(curCol + 1) != wall)
                        curCol++;
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }
}
