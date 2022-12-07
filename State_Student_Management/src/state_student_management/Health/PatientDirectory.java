/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_student_management.Health;

import Business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class PatientDirectory {
    
     ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientList;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientList = patientDirectory;
    }

    public Patient addPatient(Patient patient) {

        patientList.add(patient);
        return patient;

    }
    public boolean checkIfUsernameIsUnique(String emailId) {
        for (Patient ua : patientList) {
            if (ua.getEmailId().equals(emailId))
                return false;
        }
        return true;
    }

    public boolean checkIfEmailidExist(String emailId) {
        for (Patient user : patientList) {
            if (user.getEmailId().equals(emailId)) {
                return true;
            }
        }
        return false;
    }

    public Patient authenticatePatient(String emailId, String password) {
        for (Patient patient : patientList) {
            if (patient.getEmailId().equals(emailId) && patient.getPassword().equals(password)) {
                return patient;
            }
        }
        return null;
    }
    
}
