/**
 * Tester for terrains
 * @author birkhoff
 * @version 02/15/2018
 */
public class TestTerrain {
	public static void main(String[] args) {
		
		Forest forest = new Forest(100, 200, 100);
		Mountain mountain = new Mountain(300, 400, 25);
		WinterMountain winterMountain = new WinterMountain(500, 600, 15, 10.0);
		
		System.out.printf("Forest %s and has %d trees.\n", forest.terrainSize(), forest.getNumTrees());
		System.out.printf("Mountain %s and has %d mountains.\n", mountain.terrainSize(), mountain.getNumMountains());
		System.out.printf("Winter %s and has temperature %.1f and %d mountains.\n", winterMountain.terrainSize(), winterMountain.getTemperature(), winterMountain.getNumMountains());
	}
}
/*
 * PMR:
 * Subclass of subclass is pretty cool.
 * I am sure this will be very useful in the future, when we can just create classes based on existing classes.
 */