package dev.pacito.computerblocks.blocks;

import dev.pacito.computerblocks.display.Display;
import dev.pacito.computerblocks.*;

import java.awt.*;
import java.awt.image.BufferStrategy;

enum BlockType {
  CABLE, SOURCE, INVERTER, VIA, DELAY
};

public class Block {
  BlockPosition position;
  BlockType type;

  boolean charge;

  Color colOff, colOn;

  public Block(BlockPosition position) {
    this.position = position;
  }

  public Graphics draw(Player p, Graphics g) {
    float rectSize = Grid.BLOCK_SIZE * p.zoom;
    RealPosition drawPosition = new RealPosition(
      p.translate.x + Grid.BLOCK_RATIO * position.x * p.zoom,
      p.translate.y + Grid.BLOCK_RATIO * position.y * p.zoom
    );

    g.setColor(charge ? colOn : colOff);
    g.fillRect(Math.round(drawPosition.x - rectSize / 2), Math.round(drawPosition.y - rectSize / 2), Math.round(rectSize), Math.round(rectSize));

    return g;
  }
}

// public class DirectionalBlock extends Block {
//   public DirectionalBlock(BlockPosition position) {
//     super(position);
//   }
//
//   public Graphics draw(Player p, Graphics g) {
//     int rectSize = Grid.BLOCK_SIZE * (int) p.zoom;
//     RealPosition drawPosition = new RealPosition(
//       p.translate.x + Grid.BLOCK_RATIO * position.x * (int) p.zoom,
//       p.translate.y + Grid.BLOCK_RATIO * position.y * (int) p.zoom
//     );
//
//     g.setColor(Color.decode("#B4B4B4"));
//     g.fillRect(drawPosition.x - rectSize/2, drawPosition.y - rectSize/2, rectSize, rectSize);
//
//     return g;
//   }
// }
