import com.example.ioc.module.ExampleIoCModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.service.Service;

public class GuiceIoCExample {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new ExampleIoCModule());
		Service service = injector.getInstance(Service.class);
		service.execute();

	}

}
