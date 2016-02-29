package part4;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	
	public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();
		
		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc) && getGrid().get(neighborLoc) == null) {
				Location secondLoc = neighborLoc.getAdjacentLocation(getDirection() + d);
				if (gr.isValid(secondLoc) && getGrid().get(secondLoc) == null) {
					locs.add(secondLoc);
				}
			}
		}
		return locs;
	}
}