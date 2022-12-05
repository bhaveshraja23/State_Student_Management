/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_student_management.University;

import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class University {
     private String name;
    private String offemail;
    private String offtel;
    private int established;
    private String address;
    private ArrayList<University>universityList;
    
    
    public University(){
        universityList = new ArrayList<University>();
        this.universityList = universityList;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffemail() {
        return offemail;
    }

    public void setOffemail(String offemail) {
        this.offemail = offemail;
    }

    public String getOfftel() {
        return offtel;
    }

    public void setOfftel(String offtel) {
        this.offtel = offtel;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public ArrayList<University> getUniversityList() {
        return universityList;
    }

     public University getUniversity(String universityName){
         
        for (University university : universityList)
        {
            if (university.getName().equals(universityName))
                return university;
        }
        return null;
    }
    
    public University createAndAddUniversity() {
        University university = new University();
        universityList.add(university);
        return university;
    }
}
