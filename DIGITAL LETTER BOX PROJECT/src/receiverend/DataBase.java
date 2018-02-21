package receiverend;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataBase extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    String tn = "",AID="";
    public DataBase(String a) {
        initComponents();
        tn = a;
        setTitle("UNIVERSITY APPLICATION PORTAL");
        model=(DefaultTableModel)tb1.getModel();
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        displayall();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(0, 153, 153));

        tb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SENDER ID", "APPLICATION ID", "SENDER CONTACT NUMBER", "SUBJECT OF APPLICATION"
            }
        ));
        tb1.setCellSelectionEnabled(true);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setText("LOGOUT");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b2.setText("DELETE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b3.setText("CLEAR");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(0, 109, Short.MAX_VALUE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
         String cols[]={"SENDER ID","APPLICATION ID","SENDER CONTACT","APPLICATION SUBJECT","FILE NAME","ACCEPT","REJECT"};
        model.setColumnIdentifiers(cols);
        tb1.setModel(model);
    
    
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    try{
        con = conn(); 
        String qry="select SENDERID, APPDBID, SENDERCONTACT , APPSUBJECT , FILEUPLOAD from APPDB where TEACHERNAME = '"+tn+"' AND COUNTERS = 0 ORDER BY APPDBID DESC";
        ps=con.prepareStatement(qry);
        rs=ps.executeQuery();
        
        while(rs.next())
        {
            Object ID=rs.getString("SENDERID");
            Object appsub=rs.getString("APPSUBJECT");
            Object MOB = rs.getString("SENDERCONTACT");
            Object AID=rs.getString("APPDBID");
            Object fd=rs.getString("FILEUPLOAD");
            Object data[]={ID , AID , MOB , appsub, fd , "Accept","Reject"};
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
       
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    try{
        
        con = conn();
        //qry to delete all content from table
        String qry="update appdb set counters =1 where TEACHERNAME  = '"+tn+"' ";
        ps=con.prepareStatement(qry);
        ps.executeUpdate();
    }catch(Exception e)
    {}      
    
        model.setRowCount(0); 
        tb1.setModel(model);
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        this.setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    int row=tb1.getSelectedRow();
    AID = model.getValueAt(row, 1).toString();
    model.removeRow(row);
    Connection con=null;
    PreparedStatement ps=null;
    
    try{
        con = conn();
        //qry to delete 1 row from table
        String qry="update appdb set counters=1 where teachername = '"+tn+"' AND APPDBID = '"+AID+"' ";
        ps=con.prepareStatement(qry);
        ps.executeUpdate();
        }
    catch(Exception e)
        {     } 
    }//GEN-LAST:event_b2ActionPerformed
File selectedFile=null;
    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        int row;
        row = tb1.getSelectedRow();
        int col=tb1.getSelectedColumn();
        String id="",appid="";
        String sts="";
        if (col==5) {
            sts="Accepted";
            id=(String)tb1.getValueAt(row, 0);
            appid=(String)tb1.getValueAt(row, 1);
             System.out.println(id+" "+appid);
            Connection con=null;
            PreparedStatement ps=null;
            try{
                con = conn();
                //qry to delete 1 row from table
                String qry="update appdb set status='"+sts+"',counters = 1 where senderid = '"+id+"' AND APPDBID = '"+appid+"' ";
                ps=con.prepareStatement(qry);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "done");
                model.removeRow(row);
                }
            catch(Exception e)
                {     
                    JOptionPane.showMessageDialog(null,e);
                } 
        }
        if (col==6) {
            sts="Rejected";
            id=(String)tb1.getValueAt(row, 0);
            appid=(String)tb1.getValueAt(row, 1);
             System.out.println(id+" "+appid);
            Connection con=null;
            PreparedStatement ps=null;
            try{
                con = conn();
                //qry to delete 1 row from table
                String qry="update appdb set status='"+sts+"' , counters=1 where senderid = '"+id+"' AND APPDBID = '"+appid+"' ";
                ps=con.prepareStatement(qry);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "done");
                model.removeRow(row);
                }
            catch(Exception e)
                {     
                    JOptionPane.showMessageDialog(null,e);
                } 
        }
        if(col==4)
        {
            String fname=(String)tb1.getValueAt(row, 4);
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
               selectedFile = fileChooser.getCurrentDirectory();
               File dest =new File("E:\\java projects\\UniversityApplication\\"+fname);
               System.out.println(dest.toPath());
               String pp = selectedFile.toPath() +"\\"+ dest.getName();
               File ff= new File(pp);
               Path srcpath= ff.toPath();
               System.out.println(selectedFile.toPath());
               Path srcpath1= dest.toPath();
               System.out.println(dest.toPath());
               Files.copy(srcpath1, srcpath);
            } 
            catch (Exception ex) {
                System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_tb1MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
