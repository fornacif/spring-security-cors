package com.fornacif.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    private Model model;

    @Override
    public Model getModel() {
        return model;
    }

    @Override
    public void createModel(Model model) {
        LOGGER.info("creating model with value {}", model.getValue());
        this.model = model;
    }

}
