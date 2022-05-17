package com.rijksmuseum.tests.utils.config;

import com.rijksmuseum.tests.testData.TestData;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import com.rijksmuseum.tests.steps.ServiceSteps;

import java.util.concurrent.locks.ReentrantLock;

@Slf4j
public class ConfigHolder {

    private static final ReentrantLock lock = new ReentrantLock();
    private static volatile ConfigHolder instance;
    @Getter
    private volatile ServiceSteps testSteps;
    @Getter
    private volatile TestData testData;

    public ConfigHolder() {
    }

    public ConfigHolder getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    log.info("Initializing ConfigHolder instance");
                    ConfigHolder configHolder = new ConfigHolder();
                    configHolder.testSteps = new ConfigLoader().loadTestSteps();
                    configHolder.testData = new ConfigLoader().loadTestData();

                    instance = configHolder;
                    log.info("Initialization of the instance is completed");
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }
}
