/**
 * Winter mountain terrain
 * @author birkhoff
 * @version 02/15/2018
 */
public class WinterMountain extends Mountain {
	
	private double temperature;
	
	public WinterMountain(int l, int w, int numberOfMountains, double myTemp) {
		super(l, w, numberOfMountains);
		temperature = myTemp;
	}
	
	public double getTemperature() {
		return temperature;
	}
}