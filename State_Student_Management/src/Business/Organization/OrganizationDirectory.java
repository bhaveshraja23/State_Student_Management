/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.UniversityAdmin.getValue())) {
            organization = new UniversityAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.HealthAdmin.getValue())) {
            organization = new HealthAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.TransportAdmin.getValue())) {
            organization = new TransportAdminOrganization();
            organizationList.add(organization);   
        } else if (type.getValue().equals(Organization.Type.LibraryAdmin.getValue())) {
            organization = new LibraryAdminOrganization();
            organizationList.add(organization);   
        } else if (type.getValue().equals(Organization.Type.College.getValue())) {
            organization = new CollegeOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Hospital.getValue())) {
            organization = new HospitalOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Pharma.getValue())) {
            organization = new PharmaOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Bus.getValue())) {
            organization = new BusOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Train.getValue())) {
            organization = new TrainOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.ITS.getValue())) {
            organization = new ITSOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Books.getValue())) {
            organization = new BooksOrganization();
            organizationList.add(organization);
        } 
        return organization;
    }
    
}
