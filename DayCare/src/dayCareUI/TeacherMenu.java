/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayCareUI;

/**
 *
 * @author Nithin Bharadwaj
 */
public class TeacherMenu extends javax.swing.JPanel {

    /**
     * Creates new form TeacherMenu
     */
    public TeacherMenu() {
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

        teacherSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddAnnualReview = new javax.swing.JButton();
        btnAddTeacher = new javax.swing.JButton();
        btnViewTeacher = new javax.swing.JButton();
        btnPendingImmStudents = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        btnAddAnnualReview.setText("Add Annual Review");
        btnAddAnnualReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnnualReviewActionPerformed(evt);
            }
        });

        btnAddTeacher.setText("Add Teacher");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        btnViewTeacher.setText("View Teacher");
        btnViewTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTeacherActionPerformed(evt);
            }
        });

        btnPendingImmStudents.setText("View Pending Immunization Students");
        btnPendingImmStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingImmStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPendingImmStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddAnnualReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnAddTeacher)
                .addGap(56, 56, 56)
                .addComponent(btnViewTeacher)
                .addGap(62, 62, 62)
                .addComponent(btnAddAnnualReview)
                .addGap(62, 62, 62)
                .addComponent(btnPendingImmStudents)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        teacherSplitPane.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        teacherSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        // TODO add your handling code here:
        addTeacher teacherObj = new addTeacher();
        teacherSplitPane.setRightComponent(teacherObj);
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnViewTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTeacherActionPerformed
        // TODO add your handling code here:
        ViewTeacherDetails viewTeacherObj = new ViewTeacherDetails();
        teacherSplitPane.setRightComponent(viewTeacherObj);
    }//GEN-LAST:event_btnViewTeacherActionPerformed

    private void btnAddAnnualReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnnualReviewActionPerformed
        // TODO add your handling code here:
        AddTeacherReview addTeacherObj = new AddTeacherReview();
        teacherSplitPane.setRightComponent(addTeacherObj);
    }//GEN-LAST:event_btnAddAnnualReviewActionPerformed

    private void btnPendingImmStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingImmStudentsActionPerformed
        // TODO add your handling code here:
        PendingImmunization pendingImmunization  = new PendingImmunization();
        teacherSplitPane.setRightComponent(pendingImmunization);
    }//GEN-LAST:event_btnPendingImmStudentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAnnualReview;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnPendingImmStudents;
    private javax.swing.JButton btnViewTeacher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane teacherSplitPane;
    // End of variables declaration//GEN-END:variables
}
