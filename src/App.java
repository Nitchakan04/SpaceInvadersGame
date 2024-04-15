import javafx.scene.Parent;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        JFrame frame = new JFrame("Flappy Cat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel startPanel = new JPanel();
        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> {
            startGame();
            frame.dispose(); // Close the start window
        });
        startPanel.add(startButton);
        frame.add(startPanel);

        frame.pack(); // Pack the frame to fit the preferred size of the FlappyCat panel
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public static void startGame() {
        JFrame gameFrame = new JFrame("Flappy Cat");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyCat flappyBird = new FlappyCat();
        gameFrame.add(flappyBird);

        gameFrame.pack();
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
    }
}
