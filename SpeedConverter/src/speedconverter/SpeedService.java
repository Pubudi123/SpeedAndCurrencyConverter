package speedconverter;

public interface SpeedService {
	
	public double mphTokph(double Length);
	public double mphTofeetPerSecond(double Length);
	
	public double kphTomph(double Length);
	public double kphTometersPerSecond(double Length);
	
	public double meterPerSecondTomilesPerHour(double Length);
	public double metersPerSecondToKph(double Length);


}
