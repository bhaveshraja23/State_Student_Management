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
public class CoursesDirectory {
    
    private ArrayList<Courses> coursesList;
    
    public CoursesDirectory(){
        coursesList = new ArrayList();
    }
    
    public ArrayList<Courses> getCoursesList(){
        return coursesList;
    }
    
    public Courses addCourse(Courses courses){
        coursesList.add(courses);
        return courses;
    }
    
}
