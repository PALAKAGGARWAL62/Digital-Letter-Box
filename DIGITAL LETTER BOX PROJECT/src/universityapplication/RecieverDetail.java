package universityapplication;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class RecieverDetail extends javax.swing.JFrame {

    String id="",mob="";
    
    public RecieverDetail(String a,String b ) {
        initComponents();
         setTitle("UNIVERSITY APPLICATION PORTAL");
         getRootPane().setDefaultButton(b1);
         setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
         id=a;
         mob=b;
           Connection con = null;
           Statement  st = null;
           PreparedStatement ps = null;
           String rq1 = "SELECT  DEPARTMENTNAME FROM  DEPARTMENTDETAILS";
          
         try 
         {
               con = conn();
               st = con.createStatement();
               ResultSet rs1 = st.executeQuery(rq1);
               while (rs1.next()) {
               C1.addItem(rs1.getString("DEPARTMENTNAME"));
                
               }
              
         }
           catch (Exception e)
           {
           }         
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextArea();
        C1 = new javax.swing.JComboBox<>();
        C2 = new javax.swing.JComboBox<>();
        l4 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(868, 514));

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setText("OK");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l3.setText("SUBJECT OF APPLICATION");

        t1.setColumns(20);
        t1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t1.setRows(5);
        jScrollPane1.setViewportView(t1);

        C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DEPARTMENT" }));
        C1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                C1ItemStateChanged(evt);
            }
        });
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TEACHER" }));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b2.setText("GO TO INBOX");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        l5.setText("Department id is");

        b3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b3.setText("ATTACH FILE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(272, 272, 272)
                                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
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
     
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      
        String dept="",tec="";
       dept=(String)C1.getSelectedItem();
       tec=(String)C2.getSelectedItem();
       String deptId = l3.getText();
        Connection con = null;
       PreparedStatement ps  = null;
       String appsub = t1.getText();
       String status = "Pending";
       
       try
       {
           con = conn();
           String qry = "insert into appdb(senderid,sendercontact,departmentid,teachername,appsubject,fileupload,status,counterc,counters) values(?,?,?,?,?,?,?,?,?)";
           ps = con.prepareStatement(qry);
           ps.setString(1,id);
           ps.setString(2,mob);
           ps.setString(3, deptId);
           ps.setString(4,tec);
           ps.setString(5,appsub);
           ps.setString(6, selectedFile.getName());
           ps.setString(7,status);
           ps.setInt(8,0);
           ps.setInt(9,0);
           ps.execute();
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(rootPane, e);
       }   
        this.setVisible(false);
        new Inbox(id,mob).setVisible(true);       
    }//GEN-LAST:event_b1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
      
    }//GEN-LAST:event_C2ActionPerformed

    private void C1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_C1ItemStateChanged
        PreparedStatement ps=null;
        Connection con=null;
        ResultSet rs=null;
        String deptID="";
               String dept = (String)C1.getSelectedItem();
               String qry = "SELECT DEPARTMENTID FROM DEPARTMENTDETAILS WHERE DEPARTMENTNAME = '"+dept+"'";
               try{
              con=conn();
              ps = con.prepareStatement(qry);
              rs=  ps.executeQuery();
                   if (rs.next()) {
                    deptID=rs.getString("DEPARTMENTID");
                   }
               }
               catch(Exception e)
               {
                   System.err.println(e);
               }
               l3.setText(deptID);
               if (!deptID.equals("")) {
            try{
                   PreparedStatement ps1=null;
                       Connection con1=null;
                       con1=conn();
                       C2.removeAllItems();
               String rq2 = "SELECT TEACHERNAME  FROM  TEACHERS where DEPARTMENTID="+deptID+" ";
               ps1=con1.prepareStatement(rq2);
               ResultSet rs2 = ps1.executeQuery(rq2);
               while (rs2.next()) 
               {
               C2.addItem(rs2.getString("TEACHERNAME"));
               }
            }catch(Exception e)
            {            }
        }          
    }//GEN-LAST:event_C1ItemStateChanged

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        this.setVisible(false);
        new Inbox(id,mob).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed
File selectedFile=null;
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
          JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
             
            try {
                 selectedFile = fileChooser.getSelectedFile();
               File dest =new File("E:\\java projects\\UniversityApplication\\"+selectedFile.getName());
                Path srcpath= selectedFile.toPath();
                Path srcpath1= dest.toPath();
                Files.copy(srcpath, srcpath1);
               } 
            catch (Exception ex) {
                System.out.println(ex);
                }
            }
    }//GEN-LAST:event_b3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C1;
    private javax.swing.JComboBox<String> C2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextArea t1;
    // End of variables declaration//GEN-END:variables
}
