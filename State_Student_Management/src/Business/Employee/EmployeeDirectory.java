/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name, int role) {
        Employee employee = null;
        
         switch (role) {
             
            case 1:
                employee = new Admin(name);
                break;
                
            case 2:
                employee = new EngineeringCollegeAdmin(name);
                break;
                
            case 3:
                employee = new ArtsCollegeAdmin(name);
                break;

            case 4:
                employee = new MedicalCollegeAdmin(name);
                break;

            case 5:
                employee = new ProfessorEmployee(name);
                break;
                
             case 6:
                employee = new DoctorEmployee(name);
                break;
                
            case 7:
                employee = new HospitalManager(name);
                break;
                     
             case 8:
                employee = new PharmaManager(name);
                break;
                
            case 9:
                employee = new BusManager(name);
                break;

            case 10:
                employee = new TrainManager(name);
                break;

            case 11:
                employee = new LocoEngineerEmployee(name);
                break;

             case 12:
                employee = new ITSManager(name);
                break;
           
            case 13:
                employee = new ITSEmployee(name);
                break;

            case 14:
                employee = new BooksManager(name);
                break;
            
        }

        employeeList.add(employee);
        return employee;
  
    }

    public void removeEmployee(Employee name) {
        employeeList.remove(name);
    }
    
}
