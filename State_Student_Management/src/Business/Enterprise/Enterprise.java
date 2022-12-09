/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author bhaveshraja
 */
public abstract class Enterprise extends Organization{
    
    public EnterpriseType enterpriseType;
    public OrganizationDirectory organizationDirectory;

     public enum EnterpriseType {
         University("University"),
         Health("Health"),
         Library("Library"),
         Transport("Transport");

         public String value;

         private EnterpriseType(String value) {
             this.value = value;
         }

         public String getValue() {
             return value;
         }

         public void setValue(String value) {
             this.value = value;
         }

         @Override
         public String toString() {
             return this.value;
         }

     }

     public Enterprise(String name, EnterpriseType type) {
         super(name);
         enterpriseType = type;
         organizationDirectory = new OrganizationDirectory();
     }

     public EnterpriseType getEnterpriseType() {
         return enterpriseType;
     }

     public void setEnterpriseType(EnterpriseType enterpriseType) {
         this.enterpriseType = enterpriseType;
     }

     public OrganizationDirectory getOrganizationDirectory() {
         return organizationDirectory;
     }

     public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
         this.organizationDirectory = organizationDirectory;
     }

     @Override
     public String toString() {
         return getName();
     }
    
}
