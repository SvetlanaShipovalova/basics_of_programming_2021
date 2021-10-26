public class Person {
    private int x;
    private int y;
    private char visual;

    private Labyrinth labyrinth;

    public Person(int startX, int startY, char visual, Labyrinth labyrinth) {
        x = startX;
        y = startY;
        this.visual = visual;
        this.labyrinth = labyrinth;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public char getVisual() { return visual; }
    public Labyrinth getLabyrinth() {
        return labyrinth;
    }

    public void moveUp() {
        if(labyrinth.isWalkable(x, y - 1))
            --y;
    }
    public void moveDown() {
        if(labyrinth.isWalkable(x, y + 1))
            ++y;
    }
    public void moveLeft() {
        if(labyrinth.isWalkable(x - 1, y))
            --x;
    }
    public void moveRight() {
        if(labyrinth.isWalkable(x + 1, y))
            ++x;
    }
}
