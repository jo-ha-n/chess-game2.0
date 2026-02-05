package chess.components.settings;

import javax.swing.*;
import java.awt.*;

public class SettingsPanel extends JPanel {
    final private JPanel cardPanel;
    final private CardLayout cardLayout;

    public SettingsPanel(CardLayout cardLayout, JPanel cardPanel) {
        this.cardPanel = cardPanel;
        this.cardLayout = cardLayout;


    }
}

