/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BooksManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class BooksOrganization extends Organization {
    
    public BooksOrganization() {
        super(Organization.Type.Books.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BooksManagerRole());
        return roles;
    }
    
}
