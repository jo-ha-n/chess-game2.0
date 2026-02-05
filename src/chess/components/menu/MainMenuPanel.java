package chess.components.menu;

import chess.constants.CardNames;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class MainMenuPanel extends JPanel {

    public MainMenuPanel() {
        this.setLayout(new BorderLayout());

        JLabel mainLabel = new JLabel("Chess Game 2.0", SwingConstants.CENTER);
        mainLabel.setFont(new Font("Serif", Font.PLAIN, 46));
        mainLabel.setBorder(new EmptyBorder(250, 0, 100, 0));
        this.add(mainLabel, BorderLayout.PAGE_START);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBorder(new EmptyBorder(0, 0, 50, 0));
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(0, 2, 10, 2);
        constraints.gridx = 0;
        constraints.gridy = 0;
        buttonPanel.add(buttonBuilder("Play", CardNames.PLayMenu.getValue()), constraints);

        constraints.gridy = 1;
        buttonPanel.add(buttonBuilder("Settings", CardNames.Settings.getValue()), constraints);

        constraints.gridy = 2;
        buttonPanel.add(buttonBuilder("About This Game", CardNames.About.getValue()), constraints);
        this.add(buttonPanel, BorderLayout.CENTER);

        JLabel copyright = new JLabel("© Johan ", SwingConstants.CENTER);
        copyright.setFont(new Font("Serif", Font.PLAIN, 16));

        JPanel copyrightPanel = new JPanel(new BorderLayout());
        copyrightPanel.setBorder(new EmptyBorder(150, 0, 0, 0));
        copyrightPanel.add(copyright, BorderLayout.CENTER);

        this.add(copyrightPanel, BorderLayout.PAGE_END);
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
