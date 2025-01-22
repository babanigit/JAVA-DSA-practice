package snakeGame;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        this.add(new GamePanel()); // Add the game panel
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // Adjust the frame size to fit the panel
        this.setLocationRelativeTo(null); // Center the window
        this.setVisible(true);
    }
}
