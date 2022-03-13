package bookshopcart;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class BookshopCartActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		BookshopcartPublisher bookshopcartPublisher = new BookshopcartImpl();
		publishServiceRegistration = context.registerService(BookshopcartPublisher.class.getName(), bookshopcartPublisher,null);
		System.out.println("Bookshop Cart Service Started!");
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistration.unregister();
		System.out.println("Bookshop Cart Service has been stopped!");
	}

}
