/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class CourseDirectory {
    
    private ArrayList<Course> coursesList;
    
    public CourseDirectory(){
        coursesList = new ArrayList();
    }
    
    public ArrayList<Course> getCoursesList(){
        return coursesList;
    }
    
    public Course addCourse(Course course1){
        coursesList.add(course1);
        return course1;
    }
    
}
