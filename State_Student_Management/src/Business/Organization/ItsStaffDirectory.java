/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.ItsStaff;
import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class ItsStaffDirectory {
    
     private ArrayList<ItsStaff> itsStaffList;
    
    public ItsStaffDirectory(){
        itsStaffList = new ArrayList();
    }
    
    public ArrayList<ItsStaff> getItsStaffList() {
        return itsStaffList;
    } 
    
     public ItsStaff addItsStaff(ItsStaff its) {

        itsStaffList.add(its);
        return its;

    }
    
}
