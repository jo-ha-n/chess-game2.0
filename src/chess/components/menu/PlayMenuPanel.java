package chess.components.menu;

import chess.constants.CardNames;

import javax.swing.*;
import java.awt.*;

public class PlayMenuPanel extends JPanel {

    public PlayMenuPanel() {
        this.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(10, 2, 10, 2);
        constraints.gridx = 0;
        constraints.gridy = 0;
        buttonPanel.add(buttonBuilder("Play VS AI", CardNames.PlayVSAI.getValue()), constraints);

        constraints.gridy = 1;
        buttonPanel.add(buttonBuilder("Play VS Player Local", CardNames.PlayVSPlayerLocal.getValue()), constraints);

        constraints.gridy = 2;
        buttonPanel.add(buttonBuilder("Play VS Player Online", CardNames.PlayVSPlayerOnline.getValue()), constraints);

        constraints.gridy = 3;
        buttonPanel.add(buttonBuilder("Back", CardNames.MainMenu.getValue()), constraints);
        this.add(buttonPanel, BorderLayout.CENTER);
    }

    public JButton buttonBuilder(String text, String to) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(500, 50));

        //        CardLayout cardLayout = this.cardLayout;
        //        JPanel cardPanel = this.cardPanel;
        //
        //        button.addActionListener(new ActionListener() {
        //            @Override
        //            public void actionPerformed(ActionEvent e) {
        //                cardLayout.show(cardPanel, to);
        //            }
        //        });

        return button;
    }
}