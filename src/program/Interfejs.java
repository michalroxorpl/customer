package program;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Interfejs extends javax.swing.JFrame {

    private final Database database;
    private final DefaultTableModel modelTable;
    private final TableRowSorter<DefaultTableModel> sorter;
    
    public Interfejs() {
        initComponents();
        
        modelTable = (DefaultTableModel) jTable.getModel();
        sorter = new TableRowSorter<DefaultTableModel>(modelTable);
        jTable.setRowSorter(sorter);
        database = new Database();
    }

    private String[] getSelectedRecord(int selectedRow) {
        Vector<Object> record = (Vector<Object>) modelTable.getDataVector().elementAt(selectedRow);
        String[] object = record.toArray(new String[record.size()]);
        
        return object;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelCustomerData = new javax.swing.JLabel();
        jScrollTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonBackUp = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextSearch = new javax.swing.JTextField();
        jLabelSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel.setBackground(new java.awt.Color(204, 204, 204));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonInsert.setBackground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelCustomerData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomerData.setText("Customer Data:");

        jScrollTable.setBackground(new java.awt.Color(255, 255, 255));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Adress", "Number", "Email"
            }
        ));
        jScrollTable.setViewportView(jTable);

        jButtonBackUp.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBackUp.setText("Back up");
        jButtonBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackUpActionPerformed(evt);
            }
        });

        jButtonLoad.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLoad.setText("Load");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.setToolTipText("");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTextSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchKeyReleased(evt);
            }
        });

        jLabelSearch.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSearch.setText("Data Filtering");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabelCustomerData)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBackUp, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButtonLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButtonInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBackUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLoad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCustomerData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        database.insertCustomer(new Customer());
        modelTable.addRow(database.getLastObject());
        JOptionPane.showMessageDialog(this, "The record added to database");
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int selectedRow = jTable.getSelectedRow();
        
        if(selectedRow < 0)
            JOptionPane.showMessageDialog(this, "You have to select a row");
        else {
            String[] object = getSelectedRecord(selectedRow);
            if(database.updateCustomer(new Customer(object)))
                JOptionPane.showMessageDialog(this, "The record is updated in database");
            else
                JOptionPane.showMessageDialog(this, "The record is not updated in database");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selectedRow = jTable.getSelectedRow();
        
        if(selectedRow < 0)
            JOptionPane.showMessageDialog(this, "You have to select a row");
        else {
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Question", JOptionPane.YES_NO_OPTION);
            
            if(answer == JOptionPane.YES_OPTION) {
                String[] object = getSelectedRecord(selectedRow);
                if(database.removeCustomer(new Customer(object))) {
                    modelTable.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "The record is removed from database");
                }
                else
                    JOptionPane.showMessageDialog(this, "The record is not removed from database");
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackUpActionPerformed
        String input = JOptionPane.showInputDialog("Please enter file name: ");
        if(database.saveData(input))
            JOptionPane.showMessageDialog(this, "The database has been saved");
        else
            JOptionPane.showMessageDialog(this, "The database is not saved");
    }//GEN-LAST:event_jButtonBackUpActionPerformed

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        String input = JOptionPane.showInputDialog("Please enter file name: ");
        if(database.loadData(input)) {
            JOptionPane.showMessageDialog(this, "The database has been loaded");
            modelTable.setRowCount(0);
            
            for(int i = 0; i < database.size(); i++) {
                modelTable.addRow(database.getObject(i));
            }
        }
        else
            JOptionPane.showMessageDialog(this, "The database is not loaded");
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jTextSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchKeyReleased
        sorter.setRowFilter(RowFilter.regexFilter(jTextSearch.getText()));
    }//GEN-LAST:event_jTextSearchKeyReleased

    
    
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
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfejs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackUp;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelCustomerData;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollTable;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextSearch;
    // End of variables declaration//GEN-END:variables
}
