package com.guice.service;

import com.google.inject.Inject;
import com.guice.example.PojoToInject;

public class Service {

	private final PojoToInject pojo;

	@Inject
	public Service(PojoToInject pojo) {
		this.pojo = pojo;
	}

	public void execute() {
		System.out.println(pojo.toString());
	}
}
