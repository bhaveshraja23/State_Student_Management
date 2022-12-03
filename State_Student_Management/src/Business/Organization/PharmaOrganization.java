/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HospitalAdminRole;
import Business.Role.PharmaAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class PharmaOrganization extends Organization{
    
    public PharmaOrganization() {
        super(Organization.Type.Pharma.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmaAdminRole());
        return roles;
    }
    
}
