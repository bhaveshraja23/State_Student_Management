/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_student_management.University;

/**
 *
 * @author pavit
 */
public class Courses {
    
    private String courseName;
    private int seats;
    private int creditHours;
    private String professor;
    private String university;
    private String college;
    private int price;
    
    public Courses(String courseName, int seats, int creditHours, String professor, String university, String college, int price){
        this.courseName = courseName;
        this.seats = seats;
        this.creditHours = creditHours;
        this.professor = professor;
        this.university = university;
        this.college = college;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
          
    
}
