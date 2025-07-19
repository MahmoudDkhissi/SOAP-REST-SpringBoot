package com.mdk.microservicebanque;

import com.mdk.microservicebanque.webService.CompteRestJaxRsApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;



@Configuration
public class BanqueMsConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRsApi.class);
        return jerseyServlet;
    }


    @Bean
    public SimpleJaxWsServiceExporter resourceConfig() {
        SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:8088/banque/");
        return exporter;

    }
}
