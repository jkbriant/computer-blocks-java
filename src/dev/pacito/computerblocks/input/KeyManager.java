package dev.pacito.computerblocks.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys;
    private boolean[] keysPressed;

    public KeyManager() {
        keys = new boolean[256];
        keysPressed = new boolean[256];
    }

    public void tick() {
      for (int i = 0; i < 256; i++) {
        if (keysPressed[i]) keysPressed[i] = false;
      }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!keys[e.getKeyCode()]) {
          keysPressed[e.getKeyCode()] = true;
        }
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        keysPressed[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public boolean getKey(int keyCode) {
        return keys[keyCode];
    }
    public boolean getKeyPressed(int keyCode) {
        return keysPressed[keyCode];
    }
}
