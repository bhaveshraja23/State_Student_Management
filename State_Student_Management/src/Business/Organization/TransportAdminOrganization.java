/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TransportAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class TransportAdminOrganization extends Organization {
    
    public TransportAdminOrganization() {
        super(Organization.Type.TransportAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportAdminRole());
        return roles;
    }
    
}
