package View;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karen
 */
public class CustomerMenu extends javax.swing.JPanel {

    /**
     * Creates new form CustomerMenu
     */
    public CustomerMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        CreateCustomerButton = new javax.swing.JButton();
        SearchCustomerButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        VerticalLabel2 = new javax.swing.JLabel();
        CustomerMenuLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        OptionsBelowLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        NavigationLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        CreateCustomerButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        CreateCustomerButton.setText("Create Customer");
        CreateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCustomerButtonActionPerformed(evt);
            }
        });

        SearchCustomerButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        SearchCustomerButton.setText("Search");

        CancelButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        CancelButton.setText("Cancel");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(CreateCustomerButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(SearchCustomerButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(CancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(CreateCustomerButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .add(CancelButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(SearchCustomerButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        VerticalLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        VerticalLabel2.setText("Vertical Storage System");

        CustomerMenuLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        CustomerMenuLabel.setText("Customer Menu");

        OptionsBelowLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        OptionsBelowLabel.setText("Please select an option below");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(CustomerMenuLabel)
                    .add(VerticalLabel2)
                    .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(OptionsBelowLabel))
                .add(123, 123, 123))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(VerticalLabel2)
                .add(18, 18, 18)
                .add(CustomerMenuLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(34, 34, 34)
                .add(OptionsBelowLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        LogoutButton.setText("Logout");

        NavigationLabel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NavigationLabel.setText("Home > Customer");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(203, 203, 203)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(NavigationLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(LogoutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(NavigationLabel)
                    .add(LogoutButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 42, Short.MAX_VALUE)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(69, 69, 69)
                .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCustomerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateCustomerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CreateCustomerButton;
    private javax.swing.JLabel CustomerMenuLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel NavigationLabel;
    private javax.swing.JLabel OptionsBelowLabel;
    private javax.swing.JButton SearchCustomerButton;
    private javax.swing.JLabel VerticalLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}