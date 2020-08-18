/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timetable.Management.System;

import DB.DBconnection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author user
 */
public class ViewGeneratedGroups extends javax.swing.JFrame {
  Connection con;
  DefaultTableModel table ;
  String editable = "";
  public tableCellAlignment centerAlign = new tableCellAlignment();
    /**
     * Creates new form ViewGeneratedGroups
     */
    public ViewGeneratedGroups() throws SQLException {
        initComponents();
        showDetails();
        selectRow();
    }

    public void showDetails() throws SQLException{
     
       
         
         
        //table header alignment to center
        TableCellRenderer rendererFromHeader = jTable1.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
         
        //table row alignments to center
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerAlign);
       
        
       Statement stmt = null;
       con = new DBconnection().getDB();
       stmt = con.createStatement();
       String sql = "SELECT groupid from GroupIDs";
       
       ResultSet result = stmt.executeQuery(sql);
        table = (DefaultTableModel) jTable1.getModel(); 
       Object[] column = new Object[1];
       
       while(result.next()){
             
             column[0] = result.getString("groupid");
             
             
   
             table.addRow(column);
             
       
       }
    
    }
    
    
    public void selectRow(){
     jTable1.addMouseListener(new MouseAdapter(){
     
           public void mousePressed(MouseEvent me) {
                jTable1 = (JTable)me.getSource();
                int row = jTable1.getSelectedRow();
                
                
                 editable = String.valueOf(jTable1.getValueAt(row, 0)) ;
                 
                
            }
     });
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 650));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viewgengroups.jpg"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Group ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        delete.setText("Remove Group ID");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      int index = jTable1.getSelectedRow();
       if(index != -1) {
        int modelIndex = jTable1.convertRowIndexToModel(index); // converts the row index in the view to the appropriate index in the model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.removeRow(modelIndex);
        
        try{
         Statement stmt = new DBconnection().getDB().createStatement();
      
                String sql = "DELETE FROM GroupIDs" +
                   " WHERE groupid  = '"+editable+"'";
                System.out.println(sql);
                stmt.executeUpdate(sql);
            //success msg
            JOptionPane.showMessageDialog(this, "Record deleted succesfully","Successful",JOptionPane.INFORMATION_MESSAGE);
       }catch(Exception e){
       JOptionPane.showMessageDialog(this, "Error","Error",JOptionPane.ERROR_MESSAGE);
       
       }
    }else{
       
       JOptionPane.showMessageDialog(this, "Please select a record","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(ViewGeneratedGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGeneratedGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGeneratedGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGeneratedGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewGeneratedGroups().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewGeneratedGroups.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
