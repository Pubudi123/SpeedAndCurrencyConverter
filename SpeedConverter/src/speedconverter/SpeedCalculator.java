package speedconverter;

public class SpeedCalculator implements SpeedService{
	
	@Override
	public double mphTokph(double Speed) {
		
		Double kph = Speed * 1.609344;
		return kph;
	}

	@Override
	public double mphTofeetPerSecond(double Speed) 	{
	   
		Double feetPerSecond = Speed * 1.4666;
		return feetPerSecond;
	}


	@Override
	public double kphTomph(double Speed) {
		Double mph = Speed * 0.6213;
		return mph;
	}

	@Override
	public double kphTometersPerSecond(double Speed) {
		Double metersPerSecond = Speed * 0.277;
		return metersPerSecond;
	}

	@Override
	public double meterPerSecondTomilesPerHour(double Speed) {
		Double milesPerHour = Speed * 2.2369;
		return milesPerHour;
	}

	@Override
	public double metersPerSecondToKph(double Speed) {
		Double Kph = Speed * 3.6;
		return Kph;
	}

}
