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
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bhaveshraja
 */
public abstract class Role {
    
    public enum RoleType {
        UniversityAdmin("UniversityAdmin"),
        HealthAdmin("HealthAdmin"),
        TransportAdmin("TransportAdmin"),
        LibraryAdmin("LibraryAdmin"),
        CollegeAdmin("CollegeAdmin"),
        Professor("Professor"),
        Student("Student"),
        Doctor("Doctor"),
        HospitalAdmin("HospitalAdmin"),
        PharmaAdmin("PharmaAdmin"),
        BooksManager("BooksManager"),
        ITSEmployee("ITSEmployee"),
        //LocoEngineer("LocoEngineer"),
        SystemAdminRole("SystemAdminRole");
       
        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
                                          UserAccount account,
                                          Organization organization,
                                          Enterprise enterprise,
                                          EcoSystem business,
                                          Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
