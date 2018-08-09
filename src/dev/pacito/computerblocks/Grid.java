package dev.pacito.computerblocks;

import dev.pacito.computerblocks.display.Display;

import java.awt.*;
import java.util.ArrayList;

public class Grid {

    private static int BLOCK_RATIO = 10;
    private static int BLOCK_SPACING = 1;
    private static int BLOCK_OFFSET = BLOCK_RATIO / 2;
    private static int BLOCK_SIZE = BLOCK_RATIO - BLOCK_SPACING;

    int width, height, layers;

    public Grid(int width, int height, int layers) {
        this.width = width;
        this.height = height;
        this.layers = layers;
    }

    public Graphics draw(Player p, Graphics g, Display d) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < width; y++) {
                int rectSize = BLOCK_SIZE * (int) p.zoom;
                RealPosition drawPosition = new RealPosition(
                        p.translate.x + BLOCK_RATIO * x * (int) p.zoom,
                        p.translate.y + BLOCK_RATIO * y * (int) p.zoom
                );

                if (drawPosition.x > 0 - rectSize / 2 && drawPosition.x < d.getWidth() + rectSize / 2 && drawPosition.y > 0 - rectSize / 2 && drawPosition.y < d.getHeight() + rectSize / 2) {
                    g.setColor(Color.decode("#D7D7D7"));
                    g.fillRect(drawPosition.x, drawPosition.y, rectSize, rectSize);
                }
            }
        }
        return g;
//        for (int x = 0; x < gridWidth; x++) {
//            for (int y = 0; y < gridHeight; y++) {
//                float rectSize = BLOCK_SIZE * player.zoom;
//                RealPosition drawPosition = new RealPosition(
//                        player.translate.x + BLOCK_RATIO * x * player.zoom,
//                        player.translate.y + BLOCK_RATIO * y * player.zoom
//                );
//
//                if (drawPosition.x > 0 - rectSize / 2 && drawPosition.x < width + rectSize / 2 && drawPosition.y > 0 - rectSize / 2 && drawPosition.y < height + rectSize / 2) {
//                    fill(Color.EMPTY);
//                    rect(drawPosition.x, drawPosition.y, rectSize, rectSize);
//                }
//            }
//        }
    }

}
