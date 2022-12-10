/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Bus;
import Business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class BusDirectory {
    private ArrayList<Bus> busList;
    
    public BusDirectory(){
        busList = new ArrayList();
    }
    
    public ArrayList<Bus> getBusList() {
        return busList;
    } 
    
     public Bus addBus(Bus bus) {

        busList.add(bus);
        return bus;

    }

    
    
}
