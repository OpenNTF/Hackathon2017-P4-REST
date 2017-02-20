package org.openntf.wherespace.service;

import org.openntf.wherespace.mock.MockDataGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by frankvanderlinden on 20/02/2017.
 */
@Service
public class BaseService {

    @Value("{dataStoreURL}")
    private String dataStoreURL;

    private MockDataGenerator generator = new MockDataGenerator();

    @PostConstruct
    public void init(){
        generator.run();
    }

    public MockDataGenerator getGenerator() {
        return generator;
    }

    public void setGenerator(MockDataGenerator generator) {
        this.generator = generator;
    }
}
