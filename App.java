import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        int rowCount = 21; 
        int colCount = 19; 
        int tileSize = 32; 
        int boardWidth = colCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Create instance of PacMan */
        PacMan pacmanGame = new PacMan(); 
        frame.add(pacmanGame); 
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);
    }
}
