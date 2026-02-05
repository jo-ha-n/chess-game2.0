package chess.components;
import chess.components.menu.MainMenuPanel;
import chess.components.menu.PlayMenuPanel;
import chess.constants.CardNames;

import javax.swing.*;
import java.awt.*;

// TODO: make it scale base on the monitor's width
// TODO: make it compatible with full screen mode
// TODO: learn Swing

public class GameFrame extends JFrame {
    private static final int SCREEN_WIDTH = 1000;
    private static final int SCREEN_HEIGHT = 800;


    public void loadUI() {
        this.setTitle("Chess Game 2.0");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setLocationRelativeTo(null);

        CardLayout cardLayout = new CardLayout();
        JPanel cardContainerPanel = new JPanel(cardLayout);
        cardContainerPanel.add(new MainMenuPanel(), CardNames.MainMenu.getValue());
        cardContainerPanel.add(new PlayMenuPanel(), CardNames.PLayMenu.getValue());

        this.add(cardContainerPanel);
        this.pack();
    };
}
