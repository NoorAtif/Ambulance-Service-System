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
public class Employeeclass {
    public String name;
    public String Contact_Number;
    public String No_Of_Absence;
    public String no_Of_Presence;

    //Constructur
Employeeclass(String name,String Contact_Number, String No_Of_Absence,String no_Of_Presence) {
        this.name = name;
        this. Contact_Number= Contact_Number;
        this.  No_Of_Absence=  No_Of_Absence;  
        this.no_Of_Presence=no_Of_Presence;
    }
// Getters 
  
   public String getname() {
        return name;
    }
    
  
   public String getContact_Number(){
       return Contact_Number;
   }
   

   public String getNo_Of_Absence(){
       return No_Of_Absence;
   }
  
   public String getno_Of_Presence(){
       return no_Of_Presence;
   }
   
   public void Print() {

        System.out.println("Name:" + name);
        System.out.println("Email:" + Contact_Number);
        System.out.println("Cell-no:" + no_Of_Presence);
        System.out.println("Cell-no:" + No_Of_Absence);

    }
}