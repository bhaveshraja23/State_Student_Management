/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;

/**
 *
 * @author bhaveshraja
 */
public class ConfigureASystem {
    
    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin", 0);
        system.getUserAccountDirectory().createEmployeeAccount("sysadmin", "sysadmin", "", employee, new SystemAdminRole());
        
        return system;
        
    }
    
}
