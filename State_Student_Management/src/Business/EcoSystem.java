/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import state_student_management.University.University;

/**
 *
 * @author bhaveshraja
 */
public class EcoSystem extends Organization{

  public static EcoSystem business;
  public ArrayList<Network> networkList;
  public ArrayList<University>universityList = new ArrayList<University>();


    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        universityList = new ArrayList<University>();

    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network getNetwork(String networkName){
         
        for (Network network : networkList)
        {
            if (network.getName().equals(networkName))
                return network;
        }
        return null;
    }
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        return true;
    }
    
    public boolean isUnique(String name){
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        return true;
    }
    
     public ArrayList<University> getUniversityList() {
        return universityList;
    }

     public University getUniversity(String universityName){
         
        for (University university : universityList)
        {
            if (university.getName().equals(universityName))
                return university;
        }
        return null;
    }
    
    public University createAndAddUniversity() {
        University university = new University();
        universityList.add(university);
        return university;
    }
    
}
