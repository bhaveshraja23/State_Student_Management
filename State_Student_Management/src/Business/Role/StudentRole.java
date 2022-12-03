/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Transport.TransportAdminDashboard;
import University.StudentDashboard;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bhaveshraja
 */
public class StudentRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
                                 UserAccount account,
                                 Organization organization,
                                 Enterprise enterprise,
                                 EcoSystem ecosystem
                                 ) {
        return new StudentDashboard();
    }
    
}
