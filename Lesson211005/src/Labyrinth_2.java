import java.util.Scanner;

public class Labyrinth_2 {
    static int curLine = 10;
    static int curCol = 10;
    static char wall = '#', floor = '.', exit = 'X';
    static String[] labyrinth;

    public static void main(String[] args) {
        createLabyrinth();
        while (gameNotEnd()) {
            gameIteration();
        }
    }

    private static boolean gameNotEnd() {
        return labyrinth[curLine].charAt(curCol) != exit;
    }

    private static void gameIteration() {
        String command = readCommand();
        processCommand(command);
    }
    private static void processCommand(String command) {
        switch (command){
            case "w":
                moveUp();
                break;
            case "a":
                moveLeft();
                break;
            case "s":
                moveDown();
                break;
            case "d":
                moveRight();
                break;
            default:
        }
    }

    private static void moveUp() {
        if(labyrinth[curLine - 1].charAt(curCol) != wall)
            curLine--;
    }
    private static void moveDown() {
        if(labyrinth[curLine + 1].charAt(curCol) != wall)
            curLine++;
    }
    private static void moveLeft() {
        if(labyrinth[curLine].charAt(curCol - 1) != wall)
            curCol--;
    }
    private static void moveRight() {
        if(labyrinth[curLine].charAt(curCol + 1) != wall)
            curCol++;
    }
    private static String readCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void createLabyrinth() {
        labyrinth = new String[] {
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
    }
}
