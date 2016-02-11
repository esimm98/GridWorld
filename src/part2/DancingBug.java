package part2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	
	private int[] turns;

	public DancingBug(int[] arr) {
		turns = arr;
	}

	public void act() {
		for (int i = 0; i < turns.length; i++) {
			if (canMove()) {
				move();
			} else {
				for (int j = 0; j < turns[i]; j++) {
					turn();
				}
			}
//			if (i == turns.length - 1) {
//				i = 0;
//			}
		}
	}
}