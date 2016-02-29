package part4;

import java.awt.Color;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.util.ArrayList;

public class BlusterCritter extends Critter {
	
	public int courage;
	
	public BlusterCritter(int c) {
		setColor(Color.GRAY);
		courage = c;
	}
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> extendedNeighbors = new ArrayList<Actor>();
		Location loc = getLocation();
		int row = loc.getRow();
		int col = loc.getCol();
		
		for (int i = row - 2; i <= row + 2; i++) {
			for (int j = col - 2; j <= col + 2; j++) {
				Location temp = new Location(i, j);
				if (getGrid().isValid(temp) && getGrid().get(temp) != null && temp != loc) {
					extendedNeighbors.add(getGrid().get(temp));
				}
			}
		}
		return extendedNeighbors;
	}
	
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n < courage) {
			setColor(getColor().brighter());
			return;
		}
		setColor(getColor().darker());
	}
	
}