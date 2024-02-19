/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.CourseInstructor;

import BUS.CourseBUS;
import BUS.CourseInstructorBUS;
import BUS.DepartmentBUS;
import BUS.PersonBUS;
import DTO.CourseDTO;
import DTO.CourseInstructorDTO;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ADMIN
 */
public class AddInstructorForm extends javax.swing.JFrame {

    PersonBUS personBUS = new PersonBUS();
    CourseBUS courseBUS = new CourseBUS();
    DepartmentBUS departmentBUS = new DepartmentBUS();
    CourseInstructorBUS instuctorBUS = new CourseInstructorBUS();
    /**
     * Creates new form ThemPhanCongForm
     */
    public AddInstructorForm() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        personBUS.LoadPersonToComboBox(cbPerson);
        departmentBUS.LoadCourseToComboBox(cbDepartment);
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
        cbPerson = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbDepartment = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCourse = new javax.swing.JTable();
        btSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Course Instructor");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(450, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Person", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14))); // NOI18N

        cbPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPerson, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14))); // NOI18N

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 60));

        cbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbDepartment, 0, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSearch)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        tbCourse.setPreferredSize(new java.awt.Dimension(700, 500));
        tbCourse.setRowHeight(40);
        jScrollPane1.setViewportView(tbCourse);

        btSave.setBackground(new java.awt.Color(0, 204, 51));
        btSave.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btSave.setForeground(new java.awt.Color(255, 255, 255));
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersonActionPerformed
        // TODO add your handling code here:
        Object selectedValue = cbPerson.getSelectedItem();
        if (selectedValue != null && selectedValue instanceof Object[]) {
            Object[] pair = (Object[]) selectedValue;
            LoadCourseToTable(tbCourse, 0, "", (int)pair[0]);
        }
    }//GEN-LAST:event_cbPersonActionPerformed

    private void cbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartmentActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbDepartmentActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        Object selectedValueDpm = cbDepartment.getSelectedItem();
        Object selectedValuePs = cbPerson.getSelectedItem();
        if ((selectedValueDpm != null && selectedValueDpm instanceof Object[]) && (selectedValuePs != null && selectedValuePs instanceof Object[])) {
            Object[] pairDpm = (Object[]) selectedValueDpm;
            Object[] pairPs = (Object[]) selectedValuePs;
            LoadCourseToTable(tbCourse,(int)pairDpm[0],txtSearch.getText(),(int)pairPs[0]);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        Object selectedValue = cbPerson.getSelectedItem();
        if (selectedValue != null && selectedValue instanceof Object[]) {
            Object[] pair = (Object[]) selectedValue;
            for(int i=0;i<tbCourse.getRowCount();i++) {
                if((boolean)tbCourse.getValueAt(i, 0) && !instuctorBUS.CheckExistCourseInstructor((int)tbCourse.getValueAt(i, 1), (int)pair[0])) {
                    CourseInstructorDTO c = new CourseInstructorDTO((int)tbCourse.getValueAt(i, 1), (int)pair[0]);
                    if(!instuctorBUS.AddCourseInstructor(c)) {
                       JOptionPane.showMessageDialog(this,"Update Failed!","Notificatioin",2);
                       return;
                    }
                } else if (!(boolean)tbCourse.getValueAt(i, 0) && instuctorBUS.CheckExistCourseInstructor((int)tbCourse.getValueAt(i, 1), (int)pair[0])) {
                    CourseInstructorDTO c = new CourseInstructorDTO((int)tbCourse.getValueAt(i, 1), (int)pair[0]);
                    if(!instuctorBUS.DeleteCourseInstructor(c)) {
                       JOptionPane.showMessageDialog(this,"Update Failed!","Notificatioin",2);
                    }
                }
            }
            JOptionPane.showMessageDialog(this,"Update Successful","Notificatioin",1);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    public void LoadCourseToTable(JTable tb,int dpmID,String search,int psID) {
        String[] col = new String[]{"Select","Course ID","Course Title","Credits"};
        DefaultTableModel model = new DefaultTableModel(col,0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if(columnIndex == 0){
                    return Boolean.class;
                }
                return super.getColumnClass(columnIndex);
            }
        };
        courseBUS.ListCourse();
        ArrayList<CourseDTO> listcourse = courseBUS.getList();
        if(dpmID == 0) {
            Object[] row;
            for (CourseDTO c : listcourse) {
                if(c.getTitle().toLowerCase().contains(search.toLowerCase())){
                    row = new Object[4];
                    row[0] = instuctorBUS.CheckExistCourseInstructor(c.getCourseID(), psID);
                    row[1] = c.getCourseID();
                    row[2] = c.getTitle();
                    row[3] = c.getCredits();
                    model.addRow(row);
                }
            }  
        } else {
            Object[] row;
            for (CourseDTO c : listcourse) {
                if(c.getDepartmentID() == dpmID && c.getTitle().toLowerCase().contains(search.toLowerCase())){
                    row = new Object[4];
                    row[0] =instuctorBUS.CheckExistCourseInstructor(c.getCourseID(), psID);
                    row[1] = c.getCourseID();
                    row[2] = c.getTitle();
                    row[3] = c.getCredits();
                    model.addRow(row);
                }
            }     
        }         
        tb.setModel(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel colmodel = tbCourse.getColumnModel();
        
        colmodel.getColumn(0).setPreferredWidth(100);
        colmodel.getColumn(1).setPreferredWidth(100);
        colmodel.getColumn(2).setPreferredWidth(400);
        colmodel.getColumn(3).setPreferredWidth(100);
        
        colmodel.getColumn(1).setCellRenderer(centerRenderer);
        colmodel.getColumn(3).setCellRenderer(centerRenderer);
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(new FlatMacLightLaf());
//                    break;
//                }
//            }
//        } catch (UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddInstructorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } 
//        //</editor-fold> 
//        //</editor-fold> 
//        //</editor-fold> 
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddInstructorForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JComboBox<String> cbPerson;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCourse;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
