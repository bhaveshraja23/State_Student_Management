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
public class HealthEnterprise extends Enterprise {

    public HealthEnterprise(String name) {
        super(name, EnterpriseType.Health);
    }
    
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
