package entities;

import java.util.ArrayList;

public class Strongest implements IStrategy {

	@Override
	public Critter findTarget(Tower tower, ArrayList<Critter> g1) {
		
		Critter strongest_enemy= null;   
        double max_health = 0;
        int count = g1.size(); 			 		 // The number of critters currently within range
        for (int i = 0; i < count; i++) {
            Critter enemy = g1.get(i); 			
            double health = (g1.get(i).getHitPoints());		     	 // The health of critter
            if (health > max_health)
            {
            max_health = health;
            strongest_enemy=enemy;
            }
        }
        System.out.println(strongest_enemy);
       return(strongest_enemy);				 	 // Tower attacks this critter
		
	}

}
