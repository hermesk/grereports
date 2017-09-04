package javafiles;


import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reports extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
  private static Reports obj=null;
  
    private Reports() {
        initComponents();
        conn = DbConnect.connecrDb();
        ProperyDetails();
        setResizable(false);
       // logo();
    }
     public static Reports getObj() {
       if (obj== null){
         obj = new Reports();
        }
        else{
         obj.setExtendedState(JFrame.NORMAL);
         obj.setAlwaysOnTop(true);
         obj.requestFocus();
       }return obj;
}
    
  /*  private void logo(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/LOG.png")));
    }*/


      private void ProperyDetails(){
          conn = DbConnect.connecrDb();
        if(conn==null){
            JOptionPane.showMessageDialog(this, "Could not connect to the server");
        }
        else{
          try{
         String sql = "select *from locations where location IS NOT NULL";
         pst = conn.prepareStatement(sql);
         rs =pst.executeQuery();
         while(rs.next()){
          String lctn = rs.getString("location");         
          location.addItem(lctn);
         
                  }
       }
     catch(SQLException e)
     {
         
         JOptionPane.showMessageDialog(null, e);
    }
                                   
        }}
      
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        location = new javax.swing.JComboBox<>();
        property = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genloc = new javax.swing.JButton();
        invrp = new javax.swing.JButton();
        sdate = new com.toedter.calendar.JDateChooser();
        tdate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROPERTY PAYMENT REPORTS");
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setText("Search by Location");

        property.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Land", "House" }));
        property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyActionPerformed(evt);
            }
        });

        jLabel3.setText("From");

        jLabel4.setText("To ");

        jLabel5.setText("Select Property");

        genloc.setText("Generate");
        genloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genlocActionPerformed(evt);
            }
        });

        invrp.setText("Generate");
        invrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invrpActionPerformed(evt);
            }
        });

        sdate.setDateFormatString(" yyyy-MM-dd");

        tdate.setDateFormatString(" yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(property, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genloc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(invrp)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(property, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addComponent(genloc)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4))
                            .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(invrp))
                    .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gakuyo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(804, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertyActionPerformed

    private void genlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genlocActionPerformed
        if(conn==null){
            JOptionPane.showMessageDialog(null, "Could not connect to the server");
        }
         else{
             if (property.getSelectedItem() == "Land"){ 
        try { 
                   String start=((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim();
                   String end=((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim();
                   
              String check ="SELECT COUNT(*) AS total FROM land_trx where location = '"+location.getSelectedItem()+"'"; 
                            pst=conn.prepareStatement(check);
                            rs = pst.executeQuery();
                            
                          while(rs.next()){
                              
                              if(rs.getInt("total")>0){
                                 //String report = "src\\landrp.jrxml";
              InputStream ljp = getClass().getResourceAsStream("landreport.jrxml");
                    JasperDesign jd = JRXmlLoader.load(ljp);

            String sland =  "select * from client_details,land_trx\n" +
                          "where land_trx.idno=client_details.ID  AND land_trx.location='"+location.getSelectedItem()+"'";


                JRDesignQuery nq = new JRDesignQuery();
                nq.setText(sland);
                jd.setQuery(nq);
             
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
                JasperViewer.viewReport(jp,false);
                              
                              }
                            else{
                           JOptionPane.showMessageDialog(null, "No Land Record Found in "+" "+location.getSelectedItem()+" ");

                              }
                          
                          }
             
             
        } catch (JRException ex) {
          
        }        catch (SQLException ex) {
                     Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
                 }}
          else if (property.getSelectedItem() == "House"){ 
         
              try {
              String check ="SELECT COUNT(*) AS total FROM house_trx where location = '"+location.getSelectedItem()+"'"; 
                            pst=conn.prepareStatement(check);
                            rs = pst.executeQuery();
                          while(rs.next()){
                              if(rs.getInt("total")>0){
                               // String report = "src\\houserp.jrxml";
                InputStream ljp = getClass().getResourceAsStream("housereport.jrxml");               
                JasperDesign jd = JRXmlLoader.load(ljp);
                
                String sland = "select * from client_details,house_trx\n" 
                              + "where house_trx.idno=client_details.ID and"
                        + " house_trx.location='"+location.getSelectedItem()+"'";

                JRDesignQuery nq = new JRDesignQuery();
                nq.setText(sland);
                jd.setQuery(nq);
             
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
                JasperViewer.viewReport(jp,false);
                              
                              }
                          else{
                           JOptionPane.showMessageDialog(null, "No House Record Found in "+" "+location.getSelectedItem()+" ");

                              }
                          }
              
        } catch (JRException | SQLException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              
          }   
         }
    }//GEN-LAST:event_genlocActionPerformed

    private void invrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invrpActionPerformed

        if (((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty()&&((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
            {
             JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date and end date</font></html>");
            }
       else if(((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
             {
             JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date</font></html>");
             }
       else if (((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
                 { 
                    JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill end date</font></html>");
                 }
           else  if (property.getSelectedItem() == "Land"){ 
        try {
                   String start=((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim();
                   String end=((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim();
                   
                   String check ="SELECT COUNT(*) AS total FROM land_trx where (pdate>='"+start+"' and pdate<=('"+end+"'))"; 
                            pst=conn.prepareStatement(check);
                            rs = pst.executeQuery();
                          while(rs.next()){
                              if(rs.getInt("total")>0){
                                  
                    
              //String report = "src\\landrp.jrxml";
              InputStream ljp = getClass().getResourceAsStream("landreport.jrxml");
             JasperDesign jd = JRXmlLoader.load(ljp);

       String sland = "select * from client_details,land_trx\n" +
                     "where land_trx.idno=client_details.ID  AND (pdate>='"+start+"' and pdate<=('"+end+"')) "
                  + " and client_details.ID=land_trx.idno"; 

                JRDesignQuery nq = new JRDesignQuery();
                nq.setText(sland);
                jd.setQuery(nq);
             
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
                JasperViewer.viewReport(jp,false);
                            
                              }
                          else{
                           JOptionPane.showMessageDialog(null, "No Land Record Found ");
                              }
                              
                
                          }
                  
        } catch (JRException ex) {

        }   catch (SQLException ex) {
                Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
            }}
          else if (property.getSelectedItem() == "House"){ 
          try {
                   String start=((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim();
                   String end=((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim();
                   
                    String check ="SELECT COUNT(*) AS total FROM house_trx where (pdate>='"+start+"' and pdate<=('"+end+"'))"; 
                            pst=conn.prepareStatement(check);
                            rs = pst.executeQuery();
                          while(rs.next()){
                              if(rs.getInt("total")>0){
                              
                              // String report = "src\\houserp.jrxml";
               InputStream ljp = getClass().getResourceAsStream("housereport.jrxml");
                JasperDesign jd = JRXmlLoader.load(ljp);

                String sland = "select * from client_details,house_trx\n" 
                              + "where house_trx.idno=client_details.ID and "
                              + "(pdate>='"+start+"' and pdate<=('"+end+"'))";

                JRDesignQuery nq = new JRDesignQuery();
                nq.setText(sland);
                jd.setQuery(nq);
             
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
                JasperViewer.viewReport(jp,false);
               
                
                              }
                        else{
                           JOptionPane.showMessageDialog(null, "No House Record Found ");

                              }
                              
                          }
                   
               
        } catch (JRException ex) {
     
        }   catch (SQLException ex) {
                Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
            }
              
              
          }   
         
                 ((JTextField)sdate.getDateEditor().getUiComponent()).setText("");
               ((JTextField)tdate.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_invrpActionPerformed
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Reports().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton genloc;
    private javax.swing.JButton invrp;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> location;
    private javax.swing.JComboBox<String> property;
    private com.toedter.calendar.JDateChooser sdate;
    private com.toedter.calendar.JDateChooser tdate;
    // End of variables declaration//GEN-END:variables
}
