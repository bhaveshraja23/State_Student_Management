/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import state_student_management.Library.ITSEmployeeDashboard;
import state_student_management.Transport.TrainManagerDashboard;
import javax.swing.JFrame;
import javax.swing.JPanel;
import state_student_management.Library.ITSManagerDashboard;

/**
 *
 * @author bhaveshraja
 */
public class ITSEmployeeRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,
                                 Organization organization,
                                 Enterprise enterprise,
                                 EcoSystem ecosystem,
                                 Network network
                                 ) {
        return new ITSEmployeeDashboard();
    }
    
}
