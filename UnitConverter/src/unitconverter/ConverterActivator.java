package unitconverter;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import unitconverterdisplayer.ConverterDisplayerService;

public class ConverterActivator implements BundleActivator {

	ServiceReference serviceReference;
	ConverterDisplayerService converterDisplayerService;
	
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Converter Consumer Service is started");
		serviceReference = bundleContext.getServiceReference(ConverterDisplayerService.class.getName());
		converterDisplayerService = (ConverterDisplayerService) bundleContext.getService(serviceReference);
		converterDisplayerService.startService();
	}
	
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Converter Consumer Service is stopped");
		bundleContext.ungetService(serviceReference);
		converterDisplayerService.stopService();
	}
	
	

}
