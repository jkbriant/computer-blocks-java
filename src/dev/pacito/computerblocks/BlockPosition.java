package dev.pacito.computerblocks;

enum Rotation {
  UP, RIGHT, DOWN, LEFT
}

public class BlockPosition {
    public int x, y, l;
    public Rotation r;

    public BlockPosition(int x, int y, Rotation r, int l) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.l = l;
    }
    public BlockPosition(int x, int y, int l) {
        this.x = x;
        this.y = y;
        this.r = Rotation.UP;
        this.l = l;
    }

    public boolean isEqual(BlockPosition pos) {
      return pos != null && (x == pos.x && y == pos.y && l == pos.l);
    }
}
