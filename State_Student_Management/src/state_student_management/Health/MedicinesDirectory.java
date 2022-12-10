/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_student_management.Health;

import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class MedicinesDirectory {
    
     private ArrayList<Medicines> medicinesList;
    
    public MedicinesDirectory(){
        medicinesList = new ArrayList();
    }
    
    public ArrayList<Medicines> getMedicinesList() {
        return medicinesList;
    } 
    
     public Medicines addMedicines(Medicines medicine) {

        medicinesList.add(medicine);
        return medicine;

    }

    
}
