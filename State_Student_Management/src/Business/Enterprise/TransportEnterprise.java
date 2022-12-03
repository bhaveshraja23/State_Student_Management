/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class TransportEnterprise extends Enterprise {

    public TransportEnterprise(String name) {
        super(name, EnterpriseType.Transport);
    }
    
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
