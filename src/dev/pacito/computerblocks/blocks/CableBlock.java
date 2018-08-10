package dev.pacito.computerblocks.blocks;

import dev.pacito.computerblocks.*;
import java.awt.*;

public class CableBlock extends Block {
  public CableBlock(BlockPosition position) {
    super(position);

    type = BlockType.CABLE;
    colOn = Color.decode("#DBD44E");
    colOff = Color.decode("#B4B4B4");
  }
}
