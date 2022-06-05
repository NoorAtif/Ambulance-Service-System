/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.system;

/**
 *
 * @author Hp
 */
public class PatientInfo {
    
    public String Name;
    public String Address;
    public String AddressId;
    public String ContactNumber;
    
    //Constructor
    public PatientInfo(String Name, String Address, String AddressId,String ContactNumber)
    {   
        this.Name = Name;
        this.Address= Address;
        this.AddressId= AddressId;
        this.ContactNumber=ContactNumber;  
    }    
    
    //getter
   public String getName()
    {
      return Name;   
    }
    
    public String getAddress()
    {
      return Address;   
    }
     
    public String AddressId()
    {
      return AddressId;   
    }
    
    public String ContactNumber()
    {
      return ContactNumber;   
    }
    

public void Print() {

        System.out.println("Name:" + Name);
        System.out.println("Address:" + Address);
        System.out.println("AddressId:" + AddressId);
        System.out.println("ContactNumber:" + ContactNumber);
        

    }
    
    
}