package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	
	private int steps;
	private int sideLength;
	private boolean stop;

	public ZBug(int length) {
		steps = 0;
		sideLength = length;
		stop = false;
	}

	public void act() {
		faceEast();
		while (!stop) {
			checkStop();
			moveSide();
			turn();
			turn();
			turn();
			steps = 0;
			moveSide();
			turn();
			turn();
			turn();
			turn();
			turn();
			steps = 0;
			moveSide();
			stop = true;
		}
	}
	
	public void faceEast() {
		if (getDirection() != 90) {
			while (getDirection() != 90) {
				turn();
			}
		}
	}
	
	public void checkStop() {
		if (!canMove()) {
			stop = true;
		}
	}
	
	public void moveSide() {
		while (steps < sideLength) {
			checkStop();
			move();
			steps++;
		}
	}
}