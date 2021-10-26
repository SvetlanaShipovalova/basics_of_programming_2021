public class Labyrinth {
    private char[][] cells;
    private char wall;
    private char floor;
    private char exit;

    public Labyrinth(char[][] cells, char wall, char floor, char exit) {
        this.cells = cells;
        this.wall = wall;
        this.floor = floor;
        this.exit = exit;
    }

    public char getWall() {
        return wall;
    }
    public char getFloor() {
        return floor;
    }
    public char getExit() {
        return exit;
    }
    public char[][] getCells() {
        return cells;
    }

    public boolean isWalkable(int x, int y) {
        return y >= 0 && y < cells.length && x >= 0 && x < cells[y].length && cells[y][x] == floor;
    }
}
