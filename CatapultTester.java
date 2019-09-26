/**
 * Tester for Catapult class
 * @author Birkhoff Cheng
 * @version 0.0.1
 */
public class CatapultTester {
	public static void main(String[] args) {
		double [] speed = { 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0 };
		double [] angle = { 25.0, 30.0, 35.0, 40.0, 45.0, 50.0 };
		int i;
		
		Catapult catapult = new Catapult(speed, angle);
		catapult.calcDistance();
		
		System.out.printf("\t\tProjectile Distance (feet)\n");
		System.out.printf("   MPH");
		
		for (i = 0; i < angle.length; i++) {
			System.out.printf("%8.0f deg", angle[i]);
		}
		System.out.printf("\n");
		
		for (i = 0; i < 90; i++) {
			System.out.printf("=");
		}
		
		for (i = 0; i < speed.length; i++) {
			System.out.printf("\n%6.0f", speed[i]);
			for (int j = 0; j < angle.length; j++) {
				System.out.printf("%12.2f", catapult.getDistance(j, i));
			}
		}
	}
}
/*
 * Finally here comes the two-dimensional array part. This is a fantastic usage of 2D arrays.
 * And this time formatting is fairly easy.
 * Previously I just used tab because it's boring to count spaces. But this time it has equal signs to help me count.
 */