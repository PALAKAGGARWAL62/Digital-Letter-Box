package universityapplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inbox extends javax.swing.JFrame {
        static String id="",mob="",aid="",file="";
    DefaultTableModel model = new DefaultTableModel();
    public Inbox(String a,String b) {
        initComponents();
        id = a;
        mob=b;
        this.setTitle("UNIVERSITY APPLICATION PORTAL");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        displayall();
    }
    
       public Connection conn()
    {
        Connection con = null;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection("jdbc:mysql:///DEPARTMENT","root","");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(rootPane , e);
        }
        return con;
    }
  
       public void displayall()
    {
         String cols[]={"STATUS","APPLICATION ID","FACULTY NAME","APPLICATION SUBJECT"};
         model.setColumnIdentifiers(cols);
         tb1.setModel(model);
         Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
        con = conn(); 
        String qry="select STATUS, APPDBID, TEACHERNAME , APPSUBJECT from APPDB where senderid = '"+id+"' AND COUNTERC = 0 order by appdbid DESC ";
        ps=con.prepareStatement(qry);
        rs=ps.executeQuery();
        while(rs.next())
        {
            Object name=rs.getString("TEACHERNAME");
            Object appsub=rs.getString("APPSUBJECT");
            Object status = rs.getString("Status");
            Object aid = rs.getInt("APPDBID");
            Object data[]={status , aid , name , appsub};
            model.addRow(data);
            tb1.setModel(model);
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
            System.out.println("display");
        }
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(0, 153, 153));
        p1.setPreferredSize(new java.awt.Dimension(868, 514));

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setText("COMPOSE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        tb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STATUS", "FACULTY NAME", "SUBJECT OF APPLICATION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb1.setCellSelectionEnabled(true);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        b2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b2.setText("LOGOUT");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b3.setText("DELETE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b4.setText("CLEAR");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
           this.setVisible(false);
           new Welcome().setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        this.setVisible(false);
        new RecieverDetail( id , mob).setVisible(true);
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         int row=tb1.getSelectedRow();
         aid = model.getValueAt(row, 1).toString(); 
         model.removeRow(row);
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        try{
        con = conn();
        //qry to delete 1 row from table
        String qry="update appdb set counterc =1 where senderid = '"+id+"'and appdbid = '"+aid+"'";
        ps=con.prepareStatement(qry);
        ps.executeUpdate();
        }
        catch(Exception e)
        {         } 
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    try{
         con = conn();
        //qry to delete all content from table
        String qry="update appdb set counterc = 1 where senderid = '"+id+"' ";
        ps=con.prepareStatement(qry);
        ps.executeUpdate();
    }catch(Exception e)
    {        
    }      
        model.setRowCount(0); 
        tb1.setModel(model);
    }//GEN-LAST:event_b4ActionPerformed
    
    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked

    }//GEN-LAST:event_tb1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables

   public static void main(String args[])
    {
       java.awt.EventQueue.invokeLater(new Runnable() 
       {
            public void run() 
            {
                new Inbox(id,mob).setVisible(true);
            }
        });
    }
}
