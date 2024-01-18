package component;

import dataModel.ArtworkModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class ArtworkDetailsPopup extends JDialog {

    private ArtworkModel data;

    public ArtworkDetailsPopup(ArtworkModel data) {
        this.data = data;
        initComponents();
    }

    private void initComponents() {
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setModal(true);
        setTitle("Artwork Details");

        try {
            URL imageUrl = new URL(data.getImageURL());
            ImageIcon originalIcon = new ImageIcon(imageUrl);
            Image originalImage = originalIcon.getImage();

            int imageWidth = 300;
            int imageHeight = 400;
            Image scaledImage = originalImage.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);

            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));

            JPanel detailsPanel = new JPanel(new GridLayout(7, 1, 10, 2));
            detailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JLabel titleLabel = createStyledLabel("Title: " + data.getTitle());
            JTextArea descriptionArea = createStyledTextArea("Description: " + data.getDescription());
            JLabel dimensionsLabel = createStyledLabel("Dimensions: " + data.getDimensions());
            JLabel priceLabel = createStyledLabel("Price: " + data.getPrice());
            JLabel creationYearLabel = createStyledLabel("Creation Year: " + data.getCreationYear());
            JLabel mediumLabel = createStyledLabel("Medium: " + data.getMedium());
            JLabel artistLabel = createStyledLabel("Artist: " + data.getArtistName());

            detailsPanel.add(titleLabel);
            detailsPanel.add(descriptionArea);
            detailsPanel.add(dimensionsLabel);
            detailsPanel.add(priceLabel);
            detailsPanel.add(creationYearLabel);
            detailsPanel.add(mediumLabel);
            detailsPanel.add(artistLabel);

            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(imageLabel, BorderLayout.WEST);
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
        label.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        label.setForeground(Color.DARK_GRAY);
        return label;
    }

    private JTextArea createStyledTextArea(String text) {
        JTextArea textArea = new JTextArea(text);
        textArea.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        textArea.setForeground(Color.DARK_GRAY);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        return textArea;
    }
}
