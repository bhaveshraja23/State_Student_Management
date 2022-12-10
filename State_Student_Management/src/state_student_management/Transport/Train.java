/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_student_management.Transport;

/**
 *
 * @author pavit
 */
public class Train {
    
    private int trainNumber;
    private String routeName;
    
    public Train(int trainNumber, String routeName){
        this.trainNumber = trainNumber;
        this.routeName = routeName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
    
    
    
}
