## GridWorld P1

### Questions

1. No, sometimes the bug is just turning itself.
2. The bug moves clockwise
3. It turns at a corner
4. It leaves a flower
5. It turns until it no longer faces an edge
6. The bug moves around the rock
7. No, flowers don't move
8. They remain still, and their color fades darker
9. No, rocks don't have behavior
10. No, one actor per square

### Exercises

1.  | Degrees | Compass Direction |
		|:-------:|:-----------------:|
		|    0    |       North       |
		|    45   |     Northeast     |
		|    90   |        East       |
		|   135   |     Southeast     |
		|   180   |       South       |
		|   225   |     Southwest     |
		|   270   |        West       |
		|   315   |     Northwest     |
		|   360   |       North       |
2. You can only move the bug within the grid, otherwise there's an error.
3. setColor
4. The bug is now gone

## Part 2

### Do You Know?

1. sideLength sets the steps before the bug turns
2. steps is the number of steps the bug has taken on that side of the box
3. Because each turn only rotates 45 degrees, but the bug has to rotate 90
4. Because the BoxBug is a child of the Bug class.
5. No, if it runs into a wall, it won't make a full square.
6. If the bug runs into something, the path has to change
7. steps will be 0 whenever the bug turns

### Exercises

1. The CircleBug only turns 45 degrees, making it travel more like an octagon
5. Create the world. Create a BoxBug. Set its color. Add the BoxBug. Show the world.

## Part 3

### Set 3

1. loc1.getRow()
2. false
3. (4, 4)
4. 135
5. You pass in the direction to check

### Set 4

1. Use getOccupiedLocations(). Multiply getNumRows() * getNumCols, subtract previous number from that.
2. boolean isValid(Location (10, 10))
3. It creates methods so that all the child classes can be run, while being to adjust the specific code for each class.
4. No, an ArrayList allows for the list to expand in length, or contract.

### Set 5

1. Color, direction, location
2. Direction of 0(North), and color of red
3. So the class can be directly changed more easily.
4. Can't put itself into a grid twice, can't remove itself twice, but it can be placed, removed, then put back. It just works because it doesn't break it.
5. Run the turn() method twice.

### Set 6

1. ``` java
Grid<Actor> gr = getGrid();
if (gr == null)
  return false;
```
2. ``` java
Actor neighbor = gr.get(next);
return (neighbor == null) || (neighbor instanceof Flower);
```
3. getGrid(); Just so the bug can access the grid and its squares.
4. getLocation(); getAdjacentLocation(); So the bug can access its adjacent location to see if it can move there.
5. getGrid and getLocation are invoked
6. move() will return false from canMove(). If something goes wrong, it will just move off the screen.
7. You could use getLocation() repeatedly, but that would just make the code messier.
8. Because the flower color comes from the bug actor
9. It does, the bug puts flowers into a space after it has moved from it
10. flower.putSelfInGrid(gr, loc)
11. It calls the turn method 4 times

## Part 4

### Set 7

1. getActors(); processActors(); getMoveLocations(); selectMoveLocation(); makeMove();
2. The critters all getActors(), processActors(), getMoveLocations(),selectMoveLocation(), and makeMove()
3. No they shouldn't override getActors(). Every critter should return the actors around it in the exact same way, there's no need to change it.
4. It can examine, move, or eat an actor.
5. getLocation finds the current location of the actor, getMoveLocation finds where to move next, and move physically moves the actor
6. Because Critter just inherits its constructor from the bug class.

### Set 8

1. Because ChameleonCritter changes its makeMove method to simply turn and not move to the location. It also processes the actors differently, just changing its color instead of remove the actor.
2. So the ChameleonCritter can add a turn to the method, then use the parent makeMove method like normal to add to its action.
3. Override the makeMove method once more, and as the Chameleon moves, place the flower in that spot.
4. Because the Chameleon doesn't need to change the getActors() method. It looks at its surrounding actors the same way as any other actors.
5. The getLocation() method is contained in the general actor class.
6. By using the getGrid() method from the general Actor class.

### Set 9

1. Because the CrabCritter uses the processActors method the same way as the other critters, unlike the Chameleon which had to change its color.
2. A CrabCritter will randomly move either left or right, then check the 3 spaces in front of it for another actor. And if it's not another critter or a rock it will eat the actor.
3. getLocationsInDirections is used because the CrabCritter has to check the locations in multiple directions, not just directly in front of it.
4. (4, 4), (4, 5), and (4, 6)
5. They both only move when their possible moving spaces are open, and one space at a time. But Crabs only move sideways and turn 90 degrees to find an open space, while other Critters only move forward, turning 45 degrees at a time to find an open direction.
6. By checking the spaces on either side of it horizontally to see if it can move, otherwise it turns.
7. Because all Critters have it built in that they don't remove other Critters from the grid.