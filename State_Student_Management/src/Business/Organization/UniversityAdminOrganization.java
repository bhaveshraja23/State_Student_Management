/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TransportAdminRole;
import Business.Role.UniversityAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class UniversityAdminOrganization extends Organization {
    
    public UniversityAdminOrganization() {
        super(Organization.Type.UniversityAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new UniversityAdminRole());
        return roles;
    }
    
}
