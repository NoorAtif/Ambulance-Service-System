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
public class AmbulanceInfo {
    public String Hospital_Name;
    public String Engine_Capacity;
    public String Model;
    public String Seat_Capacity;
//Constructor
AmbulanceInfo(String Hospital_Name, String Engine_Capacity,String Model,String Seat_Capacity){
       this.Hospital_Name=Hospital_Name;
       this.Engine_Capacity=Engine_Capacity;
       this.Model=Model;
       this.Seat_Capacity=Seat_Capacity;
}

//Getters
 public String getHospital_Name(){
       return Hospital_Name;
   }
   

   public String getEngine_Capacity(){
       return Engine_Capacity;
   }
  
   public String getModel(){
       return Model;
   }
    public String getSeat_Capacity(){
       return Seat_Capacity;
   }
   
   
   public void Print() {

        System.out.println("Hospital_Name:" + Hospital_Name);
        System.out.println("Engine_Capacity:" +Engine_Capacity );
        System.out.println(" Model:" +  Model);
        System.out.println("Seat_Capacity:" + Seat_Capacity);

    }
}
