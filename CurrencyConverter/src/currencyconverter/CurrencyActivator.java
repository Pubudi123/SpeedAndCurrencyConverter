package currencyconverter;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class CurrencyActivator implements BundleActivator {

	ServiceRegistration serviceRegistration;


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Currency service is started");
		CurencyService CurencyService = new CurrencyCalculate();
		serviceRegistration = bundleContext.registerService(CurencyService.class.getName(), CurencyService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Currency service is stopped");
		serviceRegistration.unregister();
	}

}