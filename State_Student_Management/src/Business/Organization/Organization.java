/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.Student.Student;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public abstract class Organization {
    
    public String name;
    public EmployeeDirectory employeeDirectory;
    public BusDirectory busDirectory;
    public UserAccountDirectory userAccountDirectory;
    public StudentDirectory studentDirectory;
    public int organizationID;
    public static int counter = 0;

    public enum Type {
        Admin("Admin Organization"),
        EngineeringCollege("EngineeringCollege Organization"),
        ArtsCollege("ArtsCollege Organization"),
        MedicalCollege("MedicalCollege Organization"),
        Hospital("Hospital Organization"),
        Pharma("Pharma Organization"),
        Bus("Bus Organization"),
        Train("Train Organization"),
        ITS("ITS Organization"),
        Books("Books Organization");
        
        public String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        studentDirectory = new StudentDirectory();
        busDirectory = new BusDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusDirectory getBusDirectory() {
        return busDirectory;
    }

    public void setBusDirectory(BusDirectory busDirectory) {
        this.busDirectory = busDirectory;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
}
