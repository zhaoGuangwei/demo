package com.demo.osgi.provider;

/**
 * @Author zhaogw
 * @Date 2018/9/7 15:45
 */
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
public class HelloActivator implements BundleActivator {
    private ServiceRegistration registration;
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        registration = bundleContext.registerService(
                HelloWorldService.class.getName(),
                new HelloWorldServiceImpl(),
                null);
    }
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        registration.unregister();
    }
}
