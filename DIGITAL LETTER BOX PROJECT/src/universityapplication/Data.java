package universityapplication;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Data extends javax.swing.JFrame 
    {
        public Data()
        {
        initComponents();
        setTitle("UNIVERSITY APPLICATION PORTAL");
        getRootPane().setDefaultButton(b1);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        String uid = t1.getText();
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        ft1 = new javax.swing.JFormattedTextField();
        l2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        pwd1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(0, 153, 153));
        p1.setPreferredSize(new java.awt.Dimension(868, 514));

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l1.setText("USER NAME");

        l3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l3.setText("MOBILE NUMBER");

        try {
            ft1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ft1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ft1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ft1ActionPerformed(evt);
            }
        });

        l2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l2.setText("PASSWORD");

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setText("LOGIN");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        pwd1.setToolTipText("");
        pwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ft1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwd1)))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ft1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Connection conn()
    {
        Connection con = null;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql:///application","root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane , e);
        }
        return con;
    }  
     
    private void ft1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ft1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ft1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        ResultSet rs = null;
        String sid = t1.getText();
        String password = pwd1.getText();
        String no = ft1.getText();
        
        try
        {
            con = conn();
            String qry = "Select *from student_data where REDG_ID = '"+sid+"' and PASSWORD = '"+password+"' ";
            String qry1 = "update Student_data set STUDENT_CONTACT_NO  = '"+no+"' where REDG_ID = '"+sid+"' and password = '"+password+"'";
            ps=con.prepareStatement(qry);
            ps1=con.prepareStatement(qry1);
            ps1.execute();
            rs= ps.executeQuery();
            if (rs.next()) {
                 JOptionPane.showMessageDialog(rootPane, "login sucessful");
                    this.setVisible(false);
                    new RecieverDetail(sid,no).setVisible(true);
            }
            else
            JOptionPane.showMessageDialog(rootPane, "INVALID USER NAME AND PASSWORD");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
             
    }//GEN-LAST:event_b1ActionPerformed

    private void pwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JFormattedTextField ft1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JPanel p1;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}