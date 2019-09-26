/**
 * Calculate Projectile Table
 * @author Birkhoff Cheng
 * @version 0.0.1
 */
public class Catapult {
	private Double[][] distances;
	private double [] mySpeed;
	private double [] myAngle;
	private double acceleration = 9.8;
	
	/**
	 * @param speed Initial Speed Array
	 * @param angle Launch Angel Array
	 */
	Catapult(double [] speed, double [] angle) {
		mySpeed = speed;
		myAngle = angle;
		distances = new Double[myAngle.length][mySpeed.length];
	}
	
	/**
	 * Mutator method to calculate projectile distance
	 */
	public void calcDistance() {
		for (int i = 0; i < mySpeed.length; i++) {
			double mps = mySpeed[i] * 0.44704;
			for (int j = 0; j < myAngle.length; j++) {
				distances[j][i] = mps * mps * Math.sin(Math.toRadians(myAngle[j]) * 2.0) / acceleration * 3.28084;
			}
		}
	}
	
	/**
	 * Getter method to get distances from an array
	 * @param angleIndex index of angle to find
	 * @param speedIndex index of speed to find
	 * @return distance found
	 */
	public double getDistance(int angleIndex, int speedIndex) {
		return distances[angleIndex][speedIndex];
	}
}