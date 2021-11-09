import java.util.Scanner;

public class Game {
    private Labyrinth labyrinth;
    private Person person;

    public void run(String levelName) {
        prepareGame(levelName);
        while(gameInProcess()) {
            drawLabyrinth();
            processCommand();
        }
        endingGame();
    }

    private void endingGame() {
        System.out.println("Вы успешно выбрались! Для завершения нажмите Enter");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    private void processCommand() {
        System.out.print("Введине направление (w, s, a, d): ");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        switch (command) {
            case "w" -> person.moveUp();
            case "s" -> person.moveDown();
            case "a" -> person.moveLeft();
            case "d" -> person.moveRight();
        }
    }

    private void drawLabyrinth() {
        for (int i = 0; i < labyrinth.getCells().length; ++i) {
            for (int j = 0; j < labyrinth.getCells()[i].length; ++j) {
                if(i == person.getY() && j == person.getX())
                    System.out.print(person.getVisual());
                else
                    System.out.print(labyrinth.getCells()[i][j]);
            }
            System.out.println();
        }
    }

    private boolean gameInProcess() {
        return labyrinth.getCells()[person.getY()][person.getX()] != labyrinth.getExit();
    }

    private void prepareGame(String levelName) {
        labyrinth = new LabyrinthBuilder().buildLabyrinth(levelName);
        person = new PersonBuilder().buildPerson(levelName, labyrinth);
    }
}
