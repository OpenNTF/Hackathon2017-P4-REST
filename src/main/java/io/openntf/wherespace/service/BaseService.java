package io.openntf.wherespace.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by frankvanderlinden on 20/02/2017.
 */
@Service
public class BaseService {

    @Value("{dataStoreURL}")
    private String dataStoreURL;
}
