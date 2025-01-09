package org.eclipse.cargotracker.application.util;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * JAX-RS configuration.
 */
@ApplicationPath("rest")
public class RestConfiguration extends Application {

    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.beanValidation.enableOutputValidationErrorEntity.server", true);
        return properties;
    }
}
