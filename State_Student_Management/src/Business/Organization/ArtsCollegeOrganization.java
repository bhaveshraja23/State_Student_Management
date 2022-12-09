/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ArtsCollegeAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class ArtsCollegeOrganization extends Organization{
    
    public ArtsCollegeOrganization() {
        super(Organization.Type.ArtsCollege.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ArtsCollegeAdminRole());
        return roles;
    }
    
}
