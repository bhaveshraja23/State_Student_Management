/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */

public class EnterpriseDirectory {
    
    public ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }


    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;


        if (type == Enterprise.EnterpriseType.University) {
            enterprise = new UniversityEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Health) {
            enterprise = new HealthEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Library) {
            enterprise = new LibraryEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Transport) {
            enterprise = new TransportEnterprise(name);
        }

        enterpriseList.add(enterprise);

        return enterprise;
    }

    public void removeEnterprise(Enterprise e) {
        enterpriseList.remove(e);
    }

    public boolean checkIfEnterpriseExists(String enterpriseName, Enterprise.EnterpriseType type) {
        for (Enterprise e : enterpriseList) {
            if ((e.getEnterpriseType() == type) && (e.getName().equals(enterpriseName))) {
                return true;
            }
        }
        return false;
    }
     
}
