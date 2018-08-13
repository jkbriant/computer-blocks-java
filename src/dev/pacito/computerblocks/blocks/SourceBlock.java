package dev.pacito.computerblocks.blocks;

import dev.pacito.computerblocks.*;
import java.awt.*;

public class SourceBlock extends Block {
  public SourceBlock(BlockPosition position) {
    super(position);

    charge = true;
    type = BlockType.CABLE;
    colOn = Color.decode("#F2E24F");
    colOff = Color.PINK;
  }
}
