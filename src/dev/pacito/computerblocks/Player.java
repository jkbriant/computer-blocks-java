package dev.pacito.computerblocks;

import dev.pacito.computerblocks.input.KeyManager;

import java.awt.event.KeyEvent;

public class Player {

    private static int PAN_SPEED = 5;

    RealPosition translate;
    float zoom = 10;

    public Player() {
        translate = new RealPosition(50, 50);
    }

    public void tick(KeyManager keyManager) {
        translate.x += ((keyManager.getKey(KeyEvent.VK_A) ? 1: 0) - (keyManager.getKey(KeyEvent.VK_D) ? 1 : 0)) * PAN_SPEED;
        translate.y += ((keyManager.getKey(KeyEvent.VK_W) ? 1: 0) - (keyManager.getKey(KeyEvent.VK_S) ? 1 : 0)) * PAN_SPEED;

        zoom += (keyManager.getKey(KeyEvent.VK_PERIOD) ? 1: 0);
        zoom -= (keyManager.getKey(KeyEvent.VK_COMMA) ? 1: 0);

    }

}
