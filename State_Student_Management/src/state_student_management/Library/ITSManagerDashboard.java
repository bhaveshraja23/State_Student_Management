/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package state_student_management.Library;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Books;
import Business.Organization.BooksDirectory;
import Business.Organization.ItsServices;
import Business.Organization.ItsServicesDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LibraryRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhaveshraja
 */
public class ITSManagerDashboard extends javax.swing.JPanel {

    /**
     * Creates new form ITSEmployeeDashboard1
     */
    
    EcoSystem ecosystem;
    Organization organization;
    UserAccount userAccount;
    JPanel userProcessContainer;
    ItsServicesDirectory itsServicesDirectory;
    private Enterprise enterprise;
    private OrganizationDirectory organizationDirectory;
    ArrayList<ItsServices> itsServicesList = new ArrayList<>();
    DefaultTableModel itss, requests;
    int row, col;
    private DB4OUtil dB4OUtil; 
    
    public ITSManagerDashboard(JPanel userProcessContainer, EcoSystem ecosystem, Organization organization,UserAccount userAccount ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.userAccount = userAccount;
        
        itss = (DefaultTableModel) tblServices.getModel();  
        requests = (DefaultTableModel) tblRequestsIts.getModel(); 
        
        dB4OUtil = DB4OUtil.getInstance();
        
        populateItsServicesTable();
        populateItsRequestTable();

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
        ProfessorDirectoryPane = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblServices = new javax.swing.JTable();
        btnDeleteBook = new javax.swing.JButton();
        btnViewBook = new javax.swing.JButton();
        btnAddService = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtServiceName = new javax.swing.JTextField();
        btnUpdateBook = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRequestsIts = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtRole = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ProfessorDirectoryPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel8.setText("Services");

        tblServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServicesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblServices);

        btnDeleteBook.setBackground(new java.awt.Color(245, 1, 1));
        btnDeleteBook.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteBook.setText("Delete");
        btnDeleteBook.setBorder(null);
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });

        btnViewBook.setBackground(new java.awt.Color(52, 51, 242));
        btnViewBook.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBook.setText("View");
        btnViewBook.setBorder(null);
        btnViewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookActionPerformed(evt);
            }
        });

        btnAddService.setBackground(new java.awt.Color(201, 3, 3));
        btnAddService.setForeground(new java.awt.Color(255, 255, 255));
        btnAddService.setText("Add Service");
        btnAddService.setBorder(null);
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });

        jLabel6.setText("Service Name");

        btnUpdateBook.setBackground(new java.awt.Color(52, 51, 242));
        btnUpdateBook.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateBook.setText("Update");
        btnUpdateBook.setBorder(null);
        btnUpdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(txtServiceName, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(btnAddService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(172, 172, 172))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnViewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        ProfessorDirectoryPane.addTab("Services", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel9.setText("Requests");

        tblRequestsIts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student Name", "Student Email", "Request Type", "Request Name", "From Date", "To Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequestsIts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRequestsItsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblRequestsIts);

        btnAccept.setBackground(new java.awt.Color(0, 153, 0));
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Accept");
        btnAccept.setBorder(null);
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(255, 51, 51));
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.setBorder(null);
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        ProfessorDirectoryPane.addTab("Requests", jPanel7);

        jPanel2.setBackground(new java.awt.Color(201, 3, 3));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SSM.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnLogout.setForeground(new java.awt.Color(138, 138, 138));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(180, 180, 180))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ProfessorDirectoryPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProfessorDirectoryPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1128, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        row = tblRequestsIts.getSelectedRow();
        String currentStatus = requests.getValueAt(row, 3).toString();
        if(currentStatus.equalsIgnoreCase("Request raised"))
        {
            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Request Declined");
    
        }
         else if(currentStatus.equalsIgnoreCase("Request Declined")){
            
            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Request declined", 1);
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Request is already accepted", " Request Accepted", 1);
            
        }
        populateItsRequestTable();
        
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnUpdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateBookActionPerformed

    private void btnAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceActionPerformed
        // TODO add your handling code here:
        String serviceName = txtServiceName.getText().trim();
        
        
        ItsServices its = new ItsServices(serviceName);
        
        organization.itsServicesDirectory.addItsServices(its);
        populateItsServicesTable();
        
       // Object[] data = {bookName};
       // book.addRow(data);
        
        txtServiceName.setText("");
        
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnAddServiceActionPerformed

    private void btnViewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewBookActionPerformed

    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookActionPerformed
        // TODO add your handling code here:

        itss.removeRow(row);

        txtServiceName.setText("");
        
        dB4OUtil.storeSystem(ecosystem);

    }//GEN-LAST:event_btnDeleteBookActionPerformed

    private void tblServicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblServices.getModel();

        String bookName = model.getValueAt(tblServices.getSelectedRow(), 0).toString();

        txtServiceName.setText(bookName);
    }//GEN-LAST:event_tblServicesMouseClicked

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        
         String currentStatus = requests.getValueAt(row, 3).toString();
        
        if(currentStatus.equalsIgnoreCase("Request raised"))
        {
            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Request Accepted");          
            JOptionPane.showMessageDialog(this, "Request is Accepted", " Request Accepted", 1);
           
        }
        
        else if(currentStatus.equalsIgnoreCase("Request Declined")){
            
            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Request declined", 1);
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Request is already accepted", " Request Accepted", 1);
            
        }
        
        populateItsRequestTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void tblRequestsItsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestsItsMouseClicked
        // TODO add your handling code here:
        row = tblRequestsIts.getSelectedRow();
        col = tblRequestsIts.getSelectedColumn();
    }//GEN-LAST:event_tblRequestsItsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ProfessorDirectoryPane;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnUpdateBook;
    private javax.swing.JButton btnViewBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblRequestsIts;
    private javax.swing.JTable tblServices;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtServiceName;
    // End of variables declaration//GEN-END:variables

private void populateItsServicesTable() {
       
        itss.setRowCount(0);
      
        for (ItsServices its : this.organization.getItsServicesDirectory().getItsServicesList()) {
            
               Object[] objs = {its.getServiceName()};                       
               itss.addRow(objs);
           }
}

private void populateItsRequestTable() {
      requests.setRowCount(0);
        
        WorkQueue workQueue = organization.getWorkQueue();
        
        for(WorkRequest workRequest  : workQueue.getListOfWorkQueues() ){
            LibraryRequest req = (LibraryRequest) workRequest;
              
            
            Date date = null;
            if(req.getStatus().equalsIgnoreCase("Request Accepted")) {
                  date = req.getResolveDate();
            }

            Object[] objs = {req.getSender().getStudent().getName(),req.getPriority(), req.getMessage(), req.getStatus(),req.getRequestDate(),date};
            requests.addRow(objs);
            
        }
}
}

