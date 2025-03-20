package unitconverterdisplayer;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;


import currencyconverter.CurencyService;
import speedconverter.SpeedService;



public class ConverterDisplayerActivator implements BundleActivator {

	public ServiceRegistration serviceRegistration;

	public static ServiceTracker tempTracker,energyTracker,lengthTracker,storageTracker, currencyTracker, speedTracker;
	public static ServiceTracker massTracker,timeTracker;

	public static CurencyService curencyService;
	public static SpeedService speedService;

	

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Unit Converter Displayer service is started");
		ConverterDisplayerService cds = new ConverterDisplayer();
		serviceRegistration = bundleContext.registerService(ConverterDisplayerService.class.getName(), cds, null);
		

		currencyTracker = new ServiceTracker(bundleContext, CurencyService.class.getName(), null);
		speedTracker = new ServiceTracker(bundleContext, SpeedService.class.getName(), null);

	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Unit Converter Displayer service is stopped");
		serviceRegistration.unregister();
	}
	
	public static boolean CurencyChecker() {
		currencyTracker .open();
		curencyService = (CurencyService) currencyTracker.getService();
		
		if (curencyService != null)
			return true;
		else
			return false;
	}

	public static boolean SpeedChecker() {
		speedTracker .open();
		speedService = (SpeedService) speedTracker.getService();
		
		if (speedService != null)
			return true;
		else
			return false;
	}

}

