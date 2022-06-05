/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.system;

/**
 *
 * @author Amiga
 */
public class HospitalInfo {
    public String Hospital;
    public String No_Of_Ambulances;
    public String Parking_Area;

HospitalInfo(String Hospital, String No_Of_Ambulances, String Parkig_Area){
      this.Hospital=Hospital;
      this.No_Of_Ambulances= No_Of_Ambulances;
      this.Parking_Area= Parking_Area;
}
//Getters
public String getHospital(){
    return Hospital;
}
public String getNo_Of_Ambulances(){
    return No_Of_Ambulances;
}
public String getParkingArea(){
    return Parking_Area;
}
public void print(){
    
        System.out.println("Name:" + Hospital);
        System.out.println("Email:" + No_Of_Ambulances);
        System.out.println("Cell-no:" + Parking_Area);
}
}
