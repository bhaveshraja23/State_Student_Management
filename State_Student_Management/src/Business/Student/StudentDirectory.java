/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bhaveshraja
 */
public class StudentDirectory {
    
    ArrayList<Student> studentList;

    public StudentDirectory() {
        studentList = new ArrayList();
    }

    public ArrayList<Student> getStudentDirectory() {
        return studentList;
    }

    public void setStudentDirectory(ArrayList<Student> studentDirectory) {
        this.studentList = studentDirectory;
    }

    public Student addStudent(Student student) {

        studentList.add(student);
        return student;

    }
    public boolean checkIfUsernameIsUnique(String username) {
        for (Student ua : studentList) {
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }

    public boolean checkIfEmailidExist(String emailId) {
        for (Student user : studentList) {
            if (user.getEmailId().equals(emailId)) {
                return true;
            }
        }
        return false;
    }

    public Student authenticateStudent(String username, String password) {
        for (Student student : studentList) {
            if (student.getUserName().equals(username) && student.getPassword().equals(password)) {
                return student;
            }
        }
        return null;
    }
    
}
