/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.addControl;
import Controller.deleteControl;
import Controller.updateController;
import Model.bookTableLoad;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class Books extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
        loadTableData();
    }

    
    public void table(ResultSet result) {
        jTable1.setModel(DbUtils.resultSetToTableModel(result));
    }
private void loadTableData() {
        // Create an instance of tableLoad and fetch data
        bookTableLoad tableLoader = new bookTableLoad();
        ResultSet resultSet = tableLoader.fetchTableData();
        // Call the table method to populate the JTable
        table(resultSet);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Book Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Author");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 200, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 200, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 200, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\img.icons8 (6).png")); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 110, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\img.icons8 (7).png")); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 110, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\img.icons8 (8).png")); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 110, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\img.icons8 (10).png")); // NOI18N
        jButton4.setText("Home");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 110, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\img.icons8 (4).png")); // NOI18N
        jButton5.setText("Close");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author", "Category"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\375393538 (1).jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(694, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    String bookId = jTextField1.getText();
    String bookname = jTextField2.getText();
    String author =jTextField3.getText();
    String category = jTextField4.getText();
    

    if (bookId.isEmpty() || bookname .isEmpty() || author.isEmpty() || category.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill all fields");
        return;
    }

    try {
        int id = Integer.parseInt(bookId);
       
        addControl obj = new addControl();
       //obj.item(id, bookname, author, category);
     // obj.item(id, bookname, author, category);
       obj.book(id, bookname, author, category);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid number format");
}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Home h=new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    String bookId = jTextField1.getText();
    String bookname = jTextField2.getText();
    String author =jTextField3.getText();
    String category = jTextField4.getText();






    try {
        int id = Integer.parseInt(bookId);

        updateController controller = new updateController();
        //controller.update(id, bookname, author, category);
        controller.updatBook(id, bookname, author, category);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}




loadTableData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        String idText = jTextField1.getText();
      
       try {
            int id = Integer.parseInt(idText);

            deleteControl controller = new deleteControl();
            controller.delebook(id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
}


loadTableData();

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
