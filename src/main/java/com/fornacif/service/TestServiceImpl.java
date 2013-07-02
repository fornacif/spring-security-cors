package com.fornacif.service;


public class TestServiceImpl implements TestService {

	private Model model;

	@Override
	public Model getModel() {
		return model;
	}

	@Override
	public void createModel(Model model) {
		System.out.println("creating model with value " + model.getValue());
		this.model = model;
	}

}
