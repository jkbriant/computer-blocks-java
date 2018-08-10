package dev.pacito.computerblocks;

import dev.pacito.computerblocks.display.Display;
import dev.pacito.computerblocks.blocks.*;

import java.awt.*;
import java.util.ArrayList;

public class Grid {

    ArrayList<Block> blocks;

    public static int BLOCK_RATIO = 10;
    public static int BLOCK_SPACING = 1;
    public static int BLOCK_OFFSET = BLOCK_RATIO / 2;
    public static int BLOCK_SIZE = BLOCK_RATIO - BLOCK_SPACING;

    int width, height, layers;

    public Grid(int width, int height, int layers) {
        this.width = width;
        this.height = height;
        this.layers = layers;

        blocks = new ArrayList<Block>();
    }

    public Graphics draw(Player p, Graphics g, Display d) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < width; y++) {
                float rectSize = BLOCK_SIZE * p.zoom;
                RealPosition drawPosition = new RealPosition(
                        p.translate.x + BLOCK_RATIO * x * p.zoom,
                        p.translate.y + BLOCK_RATIO * y * p.zoom
                );

                if (drawPosition.x > 0 - rectSize / 2 && drawPosition.x < d.getWidth() + rectSize / 2 && drawPosition.y > 0 - rectSize / 2 && drawPosition.y < d.getHeight() + rectSize / 2) {
                    g.setColor(Color.decode("#D7D7D7"));
                    g.fillRect(Math.round(drawPosition.x - rectSize / 2), Math.round(drawPosition.y - rectSize / 2), Math.round(rectSize), Math.round(rectSize));
                }
            }
        }
        return g;
    }

}
