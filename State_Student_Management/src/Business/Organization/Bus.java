/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author pavit
 */
public class Bus {
    private int busNumber;
    private String routeName;
    private String startingPoint;
    private String endingPoint;
    
    private Bus(int busNumber, String routeName, String startingPoint, String endingPoint){
        this.busNumber = busNumber;
        this.routeName = routeName;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    
}

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(String endingPoint) {
        this.endingPoint = endingPoint;
    }
    
}

