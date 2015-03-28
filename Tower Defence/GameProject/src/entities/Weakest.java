package entities;

import java.util.ArrayList;

public class Weakest implements IStrategy {

	@Override
	public Critter findTarget(Tower tower, ArrayList<Critter> g1) {
		
		Critter weakest_enemy= null;   
        double min_health = 10000.0;
        int count = g1.size(); 			 		 // The number of critters currently within range
        for (int i = 0; i < count; i++) {
            Critter enemy = g1.get(i); 			
            double health = (g1.get(i).getHitPoints());		     	 // The health of critter
            if (health < min_health)
            {
            min_health = health;
            weakest_enemy=enemy;
            }
        }
        System.out.println(weakest_enemy);
       return(weakest_enemy);				 	 // Tower attacks this critter
		
	}

}
