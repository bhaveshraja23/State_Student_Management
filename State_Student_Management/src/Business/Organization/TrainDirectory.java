/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class TrainDirectory {
    private ArrayList<Train> trainList;
    
    public TrainDirectory(){
        trainList = new ArrayList();
    }
    
    public ArrayList<Train> getTrainList() {
        return trainList;
    } 
    
     public Train addTrain(Train train) {

        trainList.add(train);
        return train;

    }

    
    
}

