package component;

import dataModel.artistModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class ArtistDetailsPopup extends JDialog {

    private artistModel data;

    public ArtistDetailsPopup(artistModel data) {
        this.data = data;
        initComponents();
    }

    private void initComponents() {
        setSize(new Dimension(600, 400));
        setLocationRelativeTo(null);
        setModal(true);
        setTitle("Artist Details");

        try {
            URL avatarUrl = new URL(data.getAvatarLink());
            ImageIcon originalIcon = new ImageIcon(avatarUrl);
            Image originalImage = originalIcon.getImage();

            int avatarWidth = 200;
            int avatarHeight = 250;
            Image scaledImage = originalImage.getScaledInstance(avatarWidth, avatarHeight, Image.SCALE_SMOOTH);

            JLabel avatarLabel = new JLabel(new ImageIcon(scaledImage));

            JPanel detailsPanel = new JPanel(new GridLayout(4, 1, 10, 2)); // Adjusted spacing between vertical texts
            detailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JLabel nameLabel = createStyledLabel("Name: " + data.getName());
            JLabel phoneLabel = createStyledLabel("Phone: " + data.getPhone());
            JLabel emailLabel = createStyledLabel("Email: " + data.getEmail());
            JLabel socialMediaLabel = createStyledLabel("Social Media: " + data.getSocialMediaLink());

            detailsPanel.add(nameLabel);
            detailsPanel.add(phoneLabel);
            detailsPanel.add(emailLabel);
            detailsPanel.add(socialMediaLabel);

            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(avatarLabel, BorderLayout.WEST);
            mainPanel.add(detailsPanel, BorderLayout.CENTER);

            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });

            mainPanel.add(closeButton, BorderLayout.SOUTH);

            setContentPane(mainPanel);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private JLabel createStyledLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Trebuchet MS", Font.PLAIN, 16)); // Trebuchet MS font
        label.setForeground(Color.DARK_GRAY);
        return label;
    }
}
