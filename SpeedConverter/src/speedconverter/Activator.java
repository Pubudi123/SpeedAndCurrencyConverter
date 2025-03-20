package speedconverter;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import speedconverter.SpeedCalculator;
import speedconverter.SpeedService;

public class Activator implements BundleActivator {
	
	ServiceRegistration serviceRegistration;


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Speed service is started");
		SpeedService SpeedService = new SpeedCalculator();
		serviceRegistration = bundleContext.registerService(SpeedService.class.getName(), SpeedService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Speed service is stopped");
		serviceRegistration.unregister();
	}

}
