package com.example.ioc.module;

import com.google.inject.AbstractModule;
import com.guice.example.PojoToInject;

public class ExampleIoCModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(PojoToInject.class);

	}

}
