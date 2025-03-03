import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {
    private int rowCount = 21; 
    private int colCount = 19;
    private int tileSize = 32; 
    private int boardWidth = colCount * tileSize; 
    private int boardHeight = rowCount * tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    PacMan() {
        setPreferredSize(new Dimension(boardWidth, boardHeight)); 
        setBackground(Color.BLACK); 

        wallImage = new ImageIcon(getClass().getResource("/sprites/wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("/sprites/blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("/sprites/orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("/sprites/pinkGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("/sprites/redGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("/sprites/pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("/sprites/pacmanDown.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("/sprites/pacmanLeft.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("/sprites/pacmandRight.png")).getImage();

    }


}
