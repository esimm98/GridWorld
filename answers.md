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
2. South of 0(North), and color of red