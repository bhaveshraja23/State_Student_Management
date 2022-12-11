/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author bhaveshraja
 */
public class VitalSign {
    
    int pulse;
    String bloodPressure;
    int temperature;
    int sugar;

    public VitalSign(int pulse, String bloodPressure, int temperature, int sugar) {
        this.pulse = pulse;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.sugar = sugar;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
        
    
}
