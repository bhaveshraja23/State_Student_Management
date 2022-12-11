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
public class EncounterDirectory {
    
    private List<Encounter> encounterDirectory;
	
	
    public EncounterDirectory()
    {
        encounterDirectory = new ArrayList<>();
    }


    public void addEncounter(Encounter encounter)
    {
            encounterDirectory.add(encounter);
    }

    public List<Encounter> getEncounterDirectory() {
            return encounterDirectory;
    }
    
    public void removeEncounterAtIndex(int i){
        
        if (i > 0 && i < encounterDirectory.size()){
            encounterDirectory.remove(i);
        }
    }
	
    
}
