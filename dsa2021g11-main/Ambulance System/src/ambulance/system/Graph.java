/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.system;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Amiga
 */
public class Graph {
    
    Scanner sc=new Scanner(System.in);
	int vertices;       
	int edges;       
	Information info[]=new Information[30];     
	int adjMat[][]=new int[20][20]; 
	String Hospitals[]=new String[30];
	int tempdistance[]=new int[30];    
	int hospital[]=new int[30];
	int Patient;
	int flag=0;
	int counter=0;
	int add;
        
        // A Constructor For Graph
        
       Graph()   
	{
         //initializing vertices and edges
		vertices = 15;     
		edges = 25;
		Patient=0;        
		Hospitals[1]="Mayo Hospital";
		Hospitals[2]="Services Hospital";
                Hospitals[3]="Jinnah Hospital";
		Hospitals[4]="Ittefaq Hospital";
		Hospitals[5]="Shaukat Khanum Hospital";
	}
   
    
}