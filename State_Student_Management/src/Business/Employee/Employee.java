/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class Employee {
    
    private int id;
    private String ssn;
    private String name;
    private String mobile;
    private static int count = 1;
    private String emailId;
    private String password;
    private String userName;
    private int age;
    private int roleNumber;

    public Employee(String name, int roleNumber) {
        id = count;
        count++;
        this.name = name;
        this.roleNumber = roleNumber;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  
    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }
    
    
    public String getRole() {
        
        int roleNumber = this.getRoleNumber();
        
        String role = "";
        switch (roleNumber) {
            case 2:
                role = "EngineeringCollegeAdmin";
                break;
            case 3:
                role = "ArtsCollegeAdmin";
                break;
            case 4:
                role = "MedicalCollegeAdmin";
                break;
            case 5:
                role = "Professor";
                break;
            case 6:
                role = "Doctor";
                break;
            case 7:
                role = "HospitalManager";
                break;
            case 8:
                role = "PharmaManager";
                break;
            case 9:
                role = "BusManager";
                break;
            case 10:
                role = "FireControlOrganizationEmployee";
                break;
            case 11:
                role = "TrainManager";
                break;
            case 12:
                role = "ITSManager";
                break;
            case 13:
                role = "ITSEmployee";
                break;
            case 14:
                role = "BooksManager";
                break;
            case 15:
                role = "LocoEngineer";
                break;
             
        }
        return role;
    }

    public String getOrg() {
        
        int roleNumber = this.getRoleNumber();
        
        String org = "";
        if (roleNumber == 2 || roleNumber == 5) {
            org = "EngineeringCollegeOrganization";
        }
        if (roleNumber == 3 || roleNumber == 5) {
            org = "ArtsCollegeOrganization";
        }
        if (roleNumber == 4 || roleNumber == 5) {
            org = "MedicalCollegeOrganization";
        }
        if (roleNumber == 6 || roleNumber == 7) {
            org = "HospitalOrganization";
        }
        if (roleNumber == 8) {
            org = "PharmaOrganization";
        }
        if (roleNumber == 9 || roleNumber == 14) {
            org = "BusOrganization";
        }
        if (roleNumber == 10 || roleNumber == 14) {
            org = "TrainOrganization";
        }
         if (roleNumber == 11 || roleNumber == 12) {
            org = "ITSOrganization";
        }
         if (roleNumber == 13) {
            org = "BooksOrganization";
        }
        return org;
    }
    
}
