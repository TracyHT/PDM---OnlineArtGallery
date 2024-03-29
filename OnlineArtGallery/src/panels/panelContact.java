/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panels;

/**
 *
 * @author ADMIN
 */
public class panelContact extends javax.swing.JPanel {

    /**
     * Creates new form panelHome
     */
    public panelContact() {
        initComponents();
        jTextArea1.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        headerText1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setPreferredSize(new java.awt.Dimension(900, 519));

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setAlignmentX(0.0F);
        jScrollPane.setAlignmentY(0.0F);
        jScrollPane.setPreferredSize(new java.awt.Dimension(1200, 600));
        jScrollPane.setViewportView(null);

        contentPanel.setBackground(new java.awt.Color(231, 233, 205));
        contentPanel.setForeground(new java.awt.Color(255, 255, 255));
        contentPanel.setAlignmentX(0.0F);
        contentPanel.setAlignmentY(0.0F);
        contentPanel.setPreferredSize(new java.awt.Dimension(900, 2000));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerText1.setFont(new java.awt.Font("Baskerville Old Face", 0, 52)); // NOI18N
        headerText1.setForeground(new java.awt.Color(0, 51, 51));
        headerText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText1.setLabelFor(contentPanel);
        headerText1.setText("About Us");
        headerText1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        headerText1.setPreferredSize(new java.awt.Dimension(500, 64));
        contentPanel.add(headerText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 541, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_contact.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setPreferredSize(new java.awt.Dimension(400, 500));
        contentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 410, 320));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("About Us");
        contentPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("At Online Art Gallery, we are passionate about\ncreating a digital space that celebrates and \npromotes the beauty of art in all its forms. \nOur online platform serves as a dynamic hub \nwhere artists and art enthusiasts converge \nto explore, appreciate, and acquire exceptional artworks.");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        contentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 410, 200));

        jScrollPane.setViewportView(contentPanel);

        add(jScrollPane);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel headerText1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
