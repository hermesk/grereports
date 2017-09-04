package javafiles;


import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
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


public class expence_reports extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DecimalFormat df = new DecimalFormat("###.##");
  private static expence_reports obj=null;

    private expence_reports() {
        initComponents();
        conn = DbConnect.connecrDb();

        // logo();
    }

      public static expence_reports getObj() {
        if (obj== null){
            obj = new expence_reports();
        }
     
       return obj;
 }
     /*private void logo(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/LOG.png")));
    }*/
  
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ptype = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bfrom = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bto = new com.toedter.calendar.JDateChooser();
        gen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXPENSE REPORTS");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expenses", "Payments & Charges" }));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FILTER BY BRANCH AND DATE");

        bfrom.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("FROM");

        jLabel3.setText("TO");

        bto.setDateFormatString("yyyy-MM-dd");

        gen.setText("Generate");
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(gen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(bto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(ptype, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bfrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(gen)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gakuyo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
        if(((JTextField)bfrom.getDateEditor().getUiComponent()).getText().trim().isEmpty()||((JTextField)bto.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "<html><font color='red'>Kindly Fill start date and end date</font></html>");
        }
        else if(conn==null){
            JOptionPane.showMessageDialog(this, "Could not connect to the server");
        }
         else{
            if (ptype.getSelectedItem() == "Expenses"){
            
        try {
                    
                String start=((JTextField)bfrom.getDateEditor().getUiComponent()).getText().trim();
                String end=((JTextField)bto.getDateEditor().getUiComponent()).getText().trim();
                
                String check ="SELECT COUNT(*) AS total FROM expenses where (pdate>='"+start+"' and pdate<=('"+end+"'))"; 
                            pst=conn.prepareStatement(check);
                            rs = pst.executeQuery();
                            
                          while(rs.next()){
                              
                              if(rs.getInt("total")>0){
                               
                InputStream ljp = getClass().getResourceAsStream("expenses.jrxml");
                JasperDesign jd = JRXmlLoader.load(ljp);
                
                String xp="SELECT* from expenses where (pdate>='"+start+"' and pdate<=('"+end+"'))";

                 JRDesignQuery nq = new JRDesignQuery();
                nq.setText(xp);
                jd.setQuery(nq);
             
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
                JasperViewer.viewReport(jp,false);
               
                              }
                              else{
                               JOptionPane.showMessageDialog(null,"No expense Found");
                              }     
                          
                          }
               
        } catch (JRException ex) {
            Logger.getLogger(investors_payments.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (SQLException ex) {
                Logger.getLogger(expence_reports.class.getName()).log(Level.SEVERE, null, ex);
            }}
            else         if (ptype.getSelectedItem() == "Payments & Charges"){
            
        try {
                    
                String start=((JTextField)bfrom.getDateEditor().getUiComponent()).getText().trim();
                String end=((JTextField)bto.getDateEditor().getUiComponent()).getText().trim();
                
                String check ="SELECT COUNT(*) AS total FROM payments where (pdate>='"+start+"' and pdate<=('"+end+"'))"; 
                            pst=conn.prepareStatement(check);
                            rs = pst.executeQuery();
                            
                          while(rs.next()){
                              
                              if(rs.getInt("total")>0){
                               
                InputStream ljp = getClass().getResourceAsStream("charges&payments.jrxml");
                JasperDesign jd = JRXmlLoader.load(ljp);
                
                String xp="SELECT* from payments,client_details where (pdate>='"+start+"' and pdate<=('"+end+"'))"
                        + "and payments.id=client_details.ID ";

                 JRDesignQuery nq = new JRDesignQuery();
                nq.setText(xp);
                jd.setQuery(nq);
             
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
                JasperViewer.viewReport(jp,false);
               
                              }
                              else{
                               JOptionPane.showMessageDialog(null,"No payments Found");
                              }     
                          
                          }
               
        } catch (JRException ex) {
            Logger.getLogger(investors_payments.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (SQLException ex) {
                Logger.getLogger(expence_reports.class.getName()).log(Level.SEVERE, null, ex);
            }}
        
        }
              ((JTextField)bfrom.getDateEditor().getUiComponent()).setText("");
               ((JTextField)bto.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_genActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new expence_reports().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bfrom;
    private com.toedter.calendar.JDateChooser bto;
    private javax.swing.JButton gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> ptype;
    // End of variables declaration//GEN-END:variables
}
