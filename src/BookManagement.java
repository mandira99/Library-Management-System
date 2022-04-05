
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class BookManagement extends javax.swing.JFrame {

    /**
     * Creates new form BookManagement
     */
    public BookManagement() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_bid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2_book_name = new javax.swing.JTextField();
        jTextField3_author = new javax.swing.JTextField();
        jButton1_add = new javax.swing.JButton();
        jButton2_update = new javax.swing.JButton();
        jButton3_delete = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Book Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("BID:");

        jTextField1_bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_bidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Book Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Author:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Book Type:");

        jTextField2_book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_book_nameActionPerformed(evt);
            }
        });

        jButton1_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_add.setText("Add");
        jButton1_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addActionPerformed(evt);
            }
        });

        jButton2_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_update.setText("update");
        jButton2_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_updateActionPerformed(evt);
            }
        });

        jButton3_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3_delete.setText("Delete");
        jButton3_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3_author, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1_add)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2_update)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3_delete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1_bid, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1_bid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_add)
                            .addComponent(jButton2_update)
                            .addComponent(jButton3_delete))
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_bidActionPerformed

    private void jButton1_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addActionPerformed
        // TODO add your handling code here:
        String bid=jTextField1_bid.getText();
       String bname=jTextField2_book_name.getText();
       String author=jTextField3_author.getText();
       String booktype=jTextField1.getText();
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
           String sql="insert into add_books(bname,author,book_type) values"+"('"+bname+"'"+",'"+author+"','"+booktype+"')";
           Statement statment=connection.createStatement();
           int rows= statment.executeUpdate(sql);
           if(rows>0){
               JOptionPane.showMessageDialog(null,"New book added");
               jTextField1.setText("");
               jTextField2_book_name.setText("");
               jTextField3_author.setText("");
               jTextField1.setText("");
           }
           else{
               JOptionPane.showMessageDialog(null,"New book not added");
           }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "connection faled");
       }
    }//GEN-LAST:event_jButton1_addActionPerformed

    private void jButton2_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_updateActionPerformed
        // TODO add your handling code here:
        String bid=jTextField1_bid.getText();
       String bname=jTextField2_book_name.getText();
       String author=jTextField3_author.getText();
       String booktype=jTextField1.getText();
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
           String sql="UPDATE add_books set bname='"+bname+"',+author='"+author+"',book_type'"+booktype+"where bid="+bid;
           Statement statment=connection.createStatement();
           int rows= statment.executeUpdate(sql);
           if(rows>0){
               JOptionPane.showMessageDialog(null," book updated");
               jTextField1.setText("");
               jTextField2_book_name.setText("");
               jTextField3_author.setText("");
               jTextField1.setText("");
           }
           else{
               JOptionPane.showMessageDialog(null," book not updated");
           }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "connection faled");
       }
        
    }//GEN-LAST:event_jButton2_updateActionPerformed

    private void jButton3_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_deleteActionPerformed
        // TODO add your handling code here:
        String bid=jTextField1_bid.getText();
         try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
           String sql="DELETE FROM add_books WHERE bid="+bid;
           Statement statment=connection.createStatement();
           int rows= statment.executeUpdate(sql);
           if(rows>0){
               JOptionPane.showMessageDialog(null," book deleted");
               jTextField1.setText("");
               jTextField2_book_name.setText("");
               jTextField3_author.setText("");
               jTextField1.setText("");
           }
           else{
               JOptionPane.showMessageDialog(null," book not deleted");
           }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "connection faled");
       }
    }//GEN-LAST:event_jButton3_deleteActionPerformed

    private void jTextField2_book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_book_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_book_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_add;
    private javax.swing.JButton jButton2_update;
    private javax.swing.JButton jButton3_delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1_bid;
    private javax.swing.JTextField jTextField2_book_name;
    private javax.swing.JTextField jTextField3_author;
    // End of variables declaration//GEN-END:variables

    
}