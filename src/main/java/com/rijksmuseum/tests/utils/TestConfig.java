package com.rijksmuseum.tests.utils;

import org.aeonbits.owner.ConfigFactory;

public class TestConfig {
    public static Environment environment = ConfigFactory.create(Environment.class);
    public static final String LOCALIZATION = environment.localization();

}
