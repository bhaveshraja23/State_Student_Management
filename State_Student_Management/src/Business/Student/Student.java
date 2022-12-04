/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author bhaveshraja
 */
public class Student {
    
    private String emailId;
    private String password;
    private String userName;
    private String name;
    private int age;
    private String mobile;
    private String gender;
//    private ImageIcon document;
    private String GRE;
    private String IELTS;

    public Student(String emailId, String password, String userName, String name, int age, String mobile, String gender, String GRE, String IELTS) {
        this.emailId = emailId;
        this.password = password;
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.gender = gender;
        this.GRE = GRE;
        this.IELTS = IELTS;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getGRE() {
        return GRE;
    }

    public void setGRE(String GRE) {
        this.GRE = GRE;
    }

    public String getIELTS() {
        return IELTS;
    }

    public void setIELTS(String IELTS) {
        this.IELTS = IELTS;
    }
    
}
