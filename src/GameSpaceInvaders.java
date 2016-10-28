/**
 * Classic game of Space Invaders
 *
 * Created by Denis on 28.10.2016.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GameSpaceInvaders extends JFrame{

    final String TITLE_OF_PROGRAM = "Space Invaders";
    final int POINT_SCALE = 2;
    final int FIELD_WIDTH = 224*POINT_SCALE;
    final int FIELD_HEIGHT = 256*POINT_SCALE;
    final int START_LOCATION = 150;
    final int FIELD_DX = 7; // determined experimentally
    final int FIELD_DY = 26;
    final int STEP_X = 5; // wave step left-right
    final int STEP_Y = 15; // wave step down
    final int GROUND_Y = FIELD_HEIGHT - 20;
    final int LEFT = 37; // key codes
    final int RIGHT = 39;
    final int FIRE = 32;
    final int SHOW_DELAY = 20; // delay for animation
    final int[][][][] PATTERN_OF_ALIENS = {
            {{{0,0,0,0,1,1,1,1,0,0,0,0}, {0,1,1,1,1,1,1,1,1,1,1,0}, {1,1,1,1,1,1,1,1,1,1,1,1}, // alien 1/1
              {1,1,1,0,0,1,1,0,0,1,1,1}, {1,1,1,1,1,1,1,1,1,1,1,1}, {0,0,1,1,1,0,0,1,1,1,0,0},
              {0,1,1,0,0,1,1,0,0,1,1,0}, {0,0,1,1,0,0,0,0,1,1,0,0}, {12}},
             {{0,0,0,0,1,1,1,1,0,0,0,0}, {0,1,1,1,1,1,1,1,1,1,1,0}, {1,1,1,1,1,1,1,1,1,1,1,1}, // alien 1/2
              {1,1,1,0,0,1,1,0,0,1,1,1}, {1,1,1,1,1,1,1,1,1,1,1,1}, {0,0,0,1,1,0,0,1,1,0,0,0},
              {0,0,1,1,0,1,1,0,1,1,0,0}, {1,1,0,0,0,0,0,0,0,0,1,1}}},
            {{{0,0,1,0,0,0,0,0,1,0,0,0}, {0,0,0,1,0,0,0,1,0,0,0,0}, {0,0,1,1,1,1,1,1,1,0,0,0}, // alien 2/1
              {0,1,1,0,1,1,1,0,1,1,0,0}, {1,1,1,1,1,1,1,1,1,1,1,0}, {1,0,1,1,1,1,1,1,1,0,1,0},
              {1,0,1,0,0,0,0,0,1,0,1,0}, {0,0,0,1,1,0,1,1,0,0,0,0}, {11}},
             {{0,0,1,0,0,0,0,0,1,0,0,0}, {1,0,0,1,0,0,0,1,0,0,1,0}, {1,0,1,1,1,1,1,1,1,0,1,0}, // alien 2/2
              {1,1,1,0,1,1,1,0,1,1,1,0}, {1,1,1,1,1,1,1,1,1,1,1,0}, {0,1,1,1,1,1,1,1,1,1,0,0},
              {0,0,1,0,0,0,0,0,1,0,0,0}, {0,1,0,0,0,0,0,0,0,1,0,0}}},
            {{{0,0,0,1,1,0,0,0,0,0,0,0}, {0,0,1,1,1,1,0,0,0,0,0,0}, {0,1,1,1,1,1,1,0,0,0,0,0}, // alien 3/1
              {1,1,0,1,1,0,1,1,0,0,0,0}, {1,1,1,1,1,1,1,1,0,0,0,0}, {0,0,1,0,0,1,0,0,0,0,0,0},
              {0,1,0,1,1,0,1,0,0,0,0,0}, {1,0,1,0,0,1,0,1,0,0,0,0}, {8}},
             {{0,0,0,1,1,0,0,0,0,0,0,0}, {0,0,1,1,1,1,0,0,0,0,0,0}, {0,1,1,1,1,1,1,0,0,0,0,0}, // alien 3/2
              {1,1,0,1,1,0,1,1,0,0,0,0}, {1,1,1,1,1,1,1,1,0,0,0,0}, {0,1,0,1,1,0,1,0,0,0,0,0},
              {1,0,0,0,0,0,0,1,0,0,0,0}, {0,1,0,0,0,0,1,0,0,0,0,0}}}
    };
    final int MAX_ALIEN_RAYS = 2;
    Canvas canvas = new Canvas();
    Cannon cannon = new Cannon();
    BangCannon bang = new BangCannon();
    Ray ray = new Ray();
    Wave wave = new Wave();
    FlashAlien flash = new FlashAlien();
    AlienRays rays = new AlienRays();
    Random random = new Random();
    int countScore, countLives = 3;
    boolean gameOver;


    public static void main(String[] args) {
        new GameSpaceInvaders().go();
    }

    GameSpaceInvaders() {

    }

    void go() {

    }

    class Cannon {

    }

    class Ray {

    }

    class Alien {

    }

    class Wave {

    }

    class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
        }
    }
}
