/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BusDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import state_student_management.Library.BooksManagerDashboard;
import state_student_management.Transport.BusManagerDashboard;
import state_student_management.Transport.TrainManagerDashboard;

/**
 *
 * @author bhaveshraja
 */
public class BusManagerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,
                                 Organization organization,
                                 Enterprise enterprise,
                                 EcoSystem ecosystem,
                                 Network network
                                 ) {
       
        return new BusManagerDashboard(userProcessContainer, ecosystem, ecosystem.getBusDirectory());
    }
    
}
