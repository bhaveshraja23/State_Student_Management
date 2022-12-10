/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> ListOfWorkQueues;

    public WorkQueue() {
        ListOfWorkQueues = new ArrayList();
    }

    public ArrayList<WorkRequest> getListOfWorkQueues() {
        return ListOfWorkQueues;
    }
    
    public void addWorkRequest(WorkRequest workRequest){
            
        ListOfWorkQueues.add(workRequest);
    }
    
}
