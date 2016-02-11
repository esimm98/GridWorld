package part2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		DancingBug alice = new DancingBug(new int[] {2, 3, 1, 3, 2, 5, 1, 3});
		alice.setColor(Color.ORANGE);
		world.add(new Location(4, 4), alice);
		world.show();
	}
}