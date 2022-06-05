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
public class Information {
    
        int vertex_id;
	int Bed;
	boolean Ambulanceflag;
        
        //Parameterized constructor 
        
	Information(int id,int bed,boolean af)     
	{
		this.vertex_id=id;                
		this.Bed=bed;
		this.Ambulanceflag=af;
	}
    
}
