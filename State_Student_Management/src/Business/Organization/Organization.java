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
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public abstract class Organization {
    
    public String name;
    private WorkQueue workQueue;
    public EmployeeDirectory employeeDirectory;
    public BusDirectory busDirectory;
    public CourseDirectory courseDirectory;
    public BooksDirectory booksDirectory;
    public TrainDirectory trainDirectory;
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
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        studentDirectory = new StudentDirectory();
        busDirectory = new BusDirectory();
        booksDirectory = new BooksDirectory();
        trainDirectory = new TrainDirectory();
        userAccountDirectory = new UserAccountDirectory();
        courseDirectory = new CourseDirectory();
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

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCoursesDirectory(CourseDirectory coursesDirectory) {
        this.courseDirectory = coursesDirectory;
    }

    public BooksDirectory getBooksDirectory() {
        return booksDirectory;
    }

    public void setBooksDirectory(BooksDirectory booksDirectory) {
        this.booksDirectory = booksDirectory;
    }

    public TrainDirectory getTrainDirectory() {
        return trainDirectory;
    }

    public void setTrainDirectory(TrainDirectory trainDirectory) {
        this.trainDirectory = trainDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    

    
    @Override
    public String toString() {
        return name;
    }
    
}
