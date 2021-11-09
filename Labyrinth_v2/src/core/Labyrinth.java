package core;

public class Labyrinth {
    private Tile[][] tiles;

    public Tile getTile(int xPos, int yPos) {
        if(yPos < 0 || yPos >= tiles.length || xPos < 0 || xPos > tiles[yPos].length)
            return Tile.getIndestructible();
        return tiles[yPos][xPos];
    }
}
