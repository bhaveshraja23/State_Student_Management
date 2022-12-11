/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Organization.Encounter;
import Business.Organization.EncounterDirectory;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author bhaveshraja
 */
public class Student {
    
    private String id;
    private String emailId;
    private String password;
    private String userName;
    private String name;
    private int age;
    private long mobile;
    private String gender;
//    private ImageIcon document;
    private int GRE;
    private double IELTS;
    private EncounterDirectory encounterHistory;

    public Student(String id, String emailId, String password, String userName, String name, int age, long mobile, String gender, int GRE, double IELTS) {
        this.id = id;
        this.emailId = emailId;
        this.password = password;
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.gender = gender;
        this.GRE = GRE;
        this.IELTS = IELTS;
        this.encounterHistory = new EncounterDirectory();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public ImageIcon getDocument() {
//        return document;
//    }
//
//    public void setDocument(ImageIcon document) {
//        this.document = document;
//    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public int getGRE() {
        return GRE;
    }

    public void setGRE(int GRE) {
        this.GRE = GRE;
    }

    public double getIELTS() {
        return IELTS;
    }

    public void setIELTS(double IELTS) {
        this.IELTS = IELTS;
    }

    public EncounterDirectory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterDirectory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

   public void addEncounter(Encounter encounter){
       
        encounterHistory.addEncounter(encounter);
    }
    
}
