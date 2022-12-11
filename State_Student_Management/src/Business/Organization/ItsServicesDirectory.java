/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class ItsServicesDirectory {
    
     private ArrayList<ItsServices> itsServicesList;
    
    public ItsServicesDirectory(){
        itsServicesList = new ArrayList();
    }
    
    public ArrayList<ItsServices> getItsServicesList() {
        return itsServicesList;
    } 
    
     public ItsServices addItsServices(ItsServices its) {

        itsServicesList.add(its);
        return its;

    }
}
