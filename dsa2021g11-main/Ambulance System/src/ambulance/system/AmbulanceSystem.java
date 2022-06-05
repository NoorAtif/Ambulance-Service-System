/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.system;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class AmbulanceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WelcomeScreen form = new WelcomeScreen();
        form.setVisible(true);
        Graph GR=new Graph(); 
        int Option;
        System.out.println("Ambulance Managemnet System");
        System.out.println("\n 1.Admin \n 2.PatienyInformation \n 3.Exit");
        System.out.print("Enter choice:");
        Scanner scan=new Scanner(System.in);
        }
    }
