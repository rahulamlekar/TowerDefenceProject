package entities;

import java.util.ArrayList;

public class Fastest implements IStrategy {

	@Override
	public Critter findTarget(Tower tower, ArrayList<Critter> g1) {
		
		Critter fastest_enemy= null;   
        double max_speed = 0;
        int count = g1.size(); 			 		 // The number of critters currently within range
        for (int i = 0; i < count; i++) {
            Critter enemy = g1.get(i); 			
            double speed = (g1.get(i).getSpeed());		     	 // The speed of critter
            if (speed > max_speed)
            {
            max_speed = speed;
            fastest_enemy=enemy;
            }
        }
        System.out.println(fastest_enemy);
       return(fastest_enemy);				 	 // Tower attacks this critter
	
	}

}
