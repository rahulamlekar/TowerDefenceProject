package entities;

import java.util.ArrayList;

public class Farthest implements IStrategy {

	@Override
	public Critter findTarget(Tower tower, ArrayList<Critter> g1) {
		
		Critter farthest_enemy= null;   
        double max_dist = 0;
        int count = g1.size(); 			 		 // The number of current enemy ships within range
        for (int i = 0; i < count; i++) {
            Critter enemy = g1.get(i); 			
            double dist = (g1.get(i).indexInPixelPath);		     	 // The distance of this enemy to the Tower
            if (dist > max_dist)
            {
            max_dist = dist;
            farthest_enemy=enemy;
            }
        }
        System.out.println(farthest_enemy);
       return(farthest_enemy);				 	 // Tower attacks this critter
		
	}

}
