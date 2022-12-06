/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package state_student_management.SystemAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.HealthAdminRole;
import Business.Role.LibraryAdminRole;
import Business.Role.PharmaAdminRole;
import Business.Role.TransportAdminRole;
import Business.Role.UniversityAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhaveshraja
 */
public class SysAdminDashboard extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminDashboard
     */
    EcoSystem ecosystem;
    UserAccount userAccount;
    JPanel userProcessContainer;
    ArrayList<Network> networkList = new ArrayList<>();
    DefaultTableModel dtm, dtmEnterprise, dtmEnterpriseAdmin;
    int row, col;
    private DB4OUtil dB4OUtil; 

    public SysAdminDashboard(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        dtm = (DefaultTableModel) tblNetwork.getModel();
        dtmEnterprise = (DefaultTableModel) tableEnterprise.getModel();
        dtmEnterpriseAdmin = (DefaultTableModel) tblUniversityAdmin1.getModel();
        dB4OUtil = DB4OUtil.getInstance();
        populateNetworkTable();
        populateEnterpriseTable();
        displayEnterpriseTypeComboBox();
        displayNetworkComboBox();
        populateEnterpriseAdminTable();
        displayNetworkEnterpriseComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfessorDirectoryPane = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnAddNetwork = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNetwork = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnterprise = new javax.swing.JTable();
        btnAddEnterprise = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtEnterpriseName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbEnterpriseType = new javax.swing.JComboBox();
        cbNetwork = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btnAddEnterpriseAdmin = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUniversityAdmin1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboNetwork1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cbEnterprise = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtAdminName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnDelete3 = new javax.swing.JButton();
        txtAdminUsername = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAdminPassword = new javax.swing.JPasswordField();
        txtAdminContact = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtRole = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        ProfessorDirectoryPane.setBackground(new java.awt.Color(255, 255, 255));
        ProfessorDirectoryPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfessorDirectoryPaneMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnAddNetwork.setBackground(new java.awt.Color(201, 3, 3));
        btnAddNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNetwork.setText("Add Network");
        btnAddNetwork.setBorder(null);
        btnAddNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNetworkActionPerformed(evt);
            }
        });

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNetwork);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel7.setText("Add Network");

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel18.setText("Networks");

        jLabel20.setText("Network Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNetwork)
                    .addComponent(jLabel7)
                    .addComponent(jLabel20)
                    .addComponent(btnAddNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(8, 8, 8)
                        .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        ProfessorDirectoryPane.addTab("Manage Network", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel6.setText("Add Enterprise");

        tableEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEnterprise);
        if (tableEnterprise.getColumnModel().getColumnCount() > 0) {
            tableEnterprise.getColumnModel().getColumn(1).setHeaderValue("Network");
            tableEnterprise.getColumnModel().getColumn(2).setHeaderValue("Enterprise Type");
        }

        btnAddEnterprise.setBackground(new java.awt.Color(201, 3, 3));
        btnAddEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEnterprise.setText("Add Enterprise");
        btnAddEnterprise.setBorder(null);
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(245, 1, 1));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Choose Network");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel12.setText("Enterprises");

        jLabel5.setText("Choose Enterprise Type");

        jLabel9.setText("Enterprise Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(cbEnterpriseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(8, 8, 8)
                        .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        ProfessorDirectoryPane.addTab("Manage Enterprise", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnAddEnterpriseAdmin.setBackground(new java.awt.Color(201, 3, 3));
        btnAddEnterpriseAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEnterpriseAdmin.setText("Add Admin");
        btnAddEnterpriseAdmin.setBorder(null);
        btnAddEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseAdminActionPerformed(evt);
            }
        });

        tblUniversityAdmin1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Enterprise", "Admin Name", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblUniversityAdmin1);
        if (tblUniversityAdmin1.getColumnModel().getColumnCount() > 0) {
            tblUniversityAdmin1.getColumnModel().getColumn(1).setHeaderValue("Network");
            tblUniversityAdmin1.getColumnModel().getColumn(2).setHeaderValue("Enterprise Type");
        }

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel10.setText("Add Enterprise Admin");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel13.setText("Admins");

        comboNetwork1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNetwork1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Choose Network");

        jLabel14.setText("Admin Name");

        jLabel15.setText("Choose Enterprise");

        btnDelete3.setBackground(new java.awt.Color(245, 1, 1));
        btnDelete3.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete3.setText("Delete");
        btnDelete3.setBorder(null);
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });

        jLabel16.setText("Username");

        jLabel17.setText("Password");

        jLabel19.setText("Contact");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdminName)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(cbEnterprise, 0, 291, Short.MAX_VALUE)
                    .addComponent(comboNetwork1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdminUsername)
                    .addComponent(jLabel16)
                    .addComponent(btnAddEnterpriseAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addComponent(txtAdminPassword)
                    .addComponent(jLabel19)
                    .addComponent(txtAdminContact))
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboNetwork1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(8, 8, 8)
                        .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(8, 8, 8)
                        .addComponent(txtAdminContact, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(8, 8, 8)
                        .addComponent(txtAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(4, 4, 4)
                        .addComponent(txtAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEnterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        ProfessorDirectoryPane.addTab("Manage Enterprise Admins", jPanel4);

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
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ProfessorDirectoryPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(ProfessorDirectoryPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNetworkActionPerformed
        // TODO add your handling code here:
        String name = txtNetwork.getText().trim();
        if (!name.isEmpty()) {
            if (ecosystem.isUnique(name)) {
                Network network = ecosystem.createAndAddNetwork();
                network.setName(name);
                JOptionPane.showMessageDialog(null, "Network Successfully Created");
                txtNetwork.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Network Already Exits");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter city name");
        }

        populateNetworkTable();
        displayNetworkComboBox();
        displayNetworkEnterpriseComboBox();
        displayEnterpriseTypeComboBox();
        txtNetwork.setText("");
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnAddNetworkActionPerformed

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed
        // TODO add your handling code here:'
        Network network = (Network) cbNetwork.getSelectedItem();

        String EntType = cbEnterpriseType.getSelectedItem().toString();

        if (network == null || EntType == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        if (txtEnterpriseName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Enterprise Name");
            return;
        }

        String name = txtEnterpriseName.getText().trim();

        ArrayList<String> enterpriseNameList = new ArrayList<>();

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseNameList.add(e.getName());

        }
        if (enterpriseNameList.contains(name)) {
            JOptionPane.showMessageDialog(null, "Enterprise already exists with the same name");
            return;

        }
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, EntType);

        populateEnterpriseTable();
        txtEnterpriseName.setText("");
        cbEnterpriseType.setSelectedIndex(0);
        cbNetwork.setSelectedIndex(0);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tableEnterprise.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a enterprise!!", "Select enterprise", 2);
            return;
        }

        String enterpriseName = tableEnterprise.getValueAt(row, 2).toString();
        String selectedEnterpriseType = tableEnterprise.getValueAt(row, 1).toString();
        String NetworkName = tableEnterprise.getValueAt(row, 0).toString();

        for (Network network : ecosystem.getNetworkList()) {

            if (!network.getName().equalsIgnoreCase(NetworkName)) {
                continue;
            }

            Enterprise deleteEnterprise = null;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                String enterpriseType = enterprise.getEnterpriseType().toString();

                if (enterpriseType.equals(selectedEnterpriseType) && enterpriseName.equalsIgnoreCase(enterprise.getName())) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
                    if (dialogResult == 0) {
                        deleteEnterprise = enterprise;
                        break;

                    }
                }
            }

            if (deleteEnterprise != null) {
                network.getEnterpriseDirectory().getEnterpriseList().remove(deleteEnterprise);
                JOptionPane.showMessageDialog(this, "Enterprise deleted successfully", "User deleted", 1);
                populateEnterpriseTable();
                return;
            }
        }
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseAdminActionPerformed
        // TODO add your handling code here:
        String networkName = cbNetwork.getSelectedItem().toString();
        String enterpriseType = cbEnterprise.getSelectedItem().toString();
        String adminName = txtAdminName.getText();
        String contact = txtAdminContact.getText();
        String userName = txtAdminUsername.getText().trim();
        String password = txtAdminPassword.getText();

        if (networkName.isEmpty() || enterpriseType.isEmpty() || adminName.isEmpty() || userName.isEmpty()
                || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields", 2);
            return;
        }

        Network network = (Network) cbNetwork.getSelectedItem();

        Enterprise enterprise = (Enterprise) cbEnterprise.getSelectedItem();

        ArrayList<String> uName = new ArrayList<String>();
        for (UserAccount u : enterprise.getUserAccountDirectory().getUserAccountList()) {
            if (!uName.contains(userName)) {
                uName.add(u.getUsername());
            } else {
                JOptionPane.showMessageDialog(this, "Provided Username already exists. Please try with other Username", "User Exists", 1);
            }

        }
        if (uName.contains(userName)) {
            JOptionPane.showMessageDialog(this, "Provided Username already exists. Please try with other Username", "User Exists", 1);
            return;
        }
//        if (!ecosystem.checkIfUsernameIsUnique(txtUserName.getText())) {
//            JOptionPane.showMessageDialog(null, "User Already Exists");
//            return;
//        }
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(adminName);

        String typ = enterprise.getEnterpriseType().toString();
        System.out.println(typ);
        //System.out.println(network.getName() + " "+ enterprise.getName());
        if ("university".equals(typ.toLowerCase())) {
            UserAccount account = enterprise.getUserAccountDirectory().createEmployeeAccount(userName, password, contact, employee, new UniversityAdminRole());
        } else if ("transport".equals(typ.toLowerCase())) {
            UserAccount account = enterprise.getUserAccountDirectory().createEmployeeAccount(userName, password, contact, employee, new TransportAdminRole());
        } else if ("library".equals(typ.toLowerCase())) {
            UserAccount account = enterprise.getUserAccountDirectory().createEmployeeAccount(userName, password, contact, employee, new LibraryAdminRole());
        } else if ("health".equals(typ.toLowerCase())) {
            UserAccount account = enterprise.getUserAccountDirectory().createEmployeeAccount(userName, password, contact, employee, new HealthAdminRole());
        }
        populateEnterpriseAdminTable();
        txtAdminName.setText("");
        txtAdminUsername.setText("");
        txtAdminPassword.setText("");
        txtAdminContact.setText("");
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnAddEnterpriseAdminActionPerformed

    private void comboNetwork1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNetwork1ActionPerformed
        // TODO add your handling code here:
        Network network = (Network) comboNetwork1.getSelectedItem();
        if (network != null)
            displayEnterpriseComboBox(network);
    }//GEN-LAST:event_comboNetwork1ActionPerformed

    private void ProfessorDirectoryPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfessorDirectoryPaneMouseClicked
        // TODO add your handling code here:
        populateEnterpriseTable();
    }//GEN-LAST:event_ProfessorDirectoryPaneMouseClicked

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDelete3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ProfessorDirectoryPane;
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnAddEnterpriseAdmin;
    private javax.swing.JButton btnAddNetwork;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox cbEnterprise;
    private javax.swing.JComboBox cbEnterpriseType;
    private javax.swing.JComboBox cbNetwork;
    private javax.swing.JComboBox comboNetwork1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableEnterprise;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTable tblUniversityAdmin1;
    private javax.swing.JTextField txtAdminContact;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JPasswordField txtAdminPassword;
    private javax.swing.JTextField txtAdminUsername;
    private javax.swing.JTextField txtEnterpriseName;
    private javax.swing.JTextField txtNetwork;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables

    public void populateNetworkTable() {
        dtm.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            Object obj[] = {network.getName()};
            dtm.addRow(obj);
        }
    }

    private void populateEnterpriseTable() {

        dtmEnterprise.setRowCount(0);
        System.out.println(ecosystem.getNetworkList().size());
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                Object obj[] = {network.getName(), enterprise.getEnterpriseType().getValue(), enterprise.getName()};
                dtmEnterprise.addRow(obj);
            }
        }
    }

    private void displayEnterpriseTypeComboBox() {

        cbNetwork.removeAllItems();
        cbEnterpriseType.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) {
            cbNetwork.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cbEnterpriseType.addItem(type);
        }

    }

    private void displayNetworkComboBox() {
        cbNetwork.removeAllItems();
        System.out.println(ecosystem.getNetworkList());
        for (Network network : ecosystem.getNetworkList()) {
            cbNetwork.addItem(network);
        }
    }

    private void displayNetworkEnterpriseComboBox() {
        comboNetwork1.removeAllItems();
        System.out.println(ecosystem.getNetworkList());
        for (Network network : ecosystem.getNetworkList()) {
            comboNetwork1.addItem(network);
        }
    }

    private void displayEnterpriseComboBox(Network network) {
        cbEnterprise.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            cbEnterprise.addItem(enterprise);
        }
    }

    private void populateEnterpriseAdminTable() {

        dtmEnterpriseAdmin.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println("hi");
                System.out.println(enterprise.getUserAccountDirectory().getUserAccountList().size());
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {

                    userAccount.getEmployee().getName();
                    Object obj[] = {network.getName(), enterprise.getEnterpriseType().getValue(), userAccount.getEmployee().getName(), userAccount.getUsername(), userAccount.getPassword()};
                    dtmEnterpriseAdmin.addRow(obj);
                }
            }
        }
    }
}