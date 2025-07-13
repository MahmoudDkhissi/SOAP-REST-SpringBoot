package com.mdk.microservicebanque;

import com.mdk.microservicebanque.webService.CompteRestJaxRsApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BanqueMsConfig {

    //@Bean
    /*
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRsApi.class);
        return jerseyServlet;
    }
     */
}
