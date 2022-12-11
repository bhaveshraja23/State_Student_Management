/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.time.LocalDate;

/**
 *
 * @author bhaveshraja
 */
public class Encounter {
    
    private String date;
    private VitalSign vitalSign;
    
    public Encounter(String date, VitalSign vitalSign) {
            super();
            this.date = date;
            this.vitalSign = vitalSign;
    }
	
	
	public String getDate() {
		return date;
	}
	
	
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public VitalSign getVitalSign() {
		return vitalSign;
	}
	
	
	public void setVitalSign(VitalSign vitalSign) {
		this.vitalSign = vitalSign;
	}	
    
}
