package com.mediaarts.rest.config;

import org.glassfish.jersey.server.*;
import org.springframework.stereotype.*;
import javax.ws.rs.*;

/**
 * Created by andrewssamuel on 5/7/16.
 */
@Component
public class JerseyInitializr extends ResourceConfig {

    public JerseyInitializr() {
        this.packages("com.mediaarts.rest.resources");
    }

}
