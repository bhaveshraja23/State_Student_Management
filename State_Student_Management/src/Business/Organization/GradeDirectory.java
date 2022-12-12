/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhaveshraja
 */
public class GradeDirectory {
    
    private List<Grading> gradeDirectory;
	
    public GradeDirectory()
    {
        gradeDirectory = new ArrayList<>();
    }

    public void addGrade(Grading grading)
    {
        System.out.println("Inside add grade 2");
            gradeDirectory.add(grading);
    }

    public List<Grading> getGradingDirectory() {
            return gradeDirectory;
    }
    
}
