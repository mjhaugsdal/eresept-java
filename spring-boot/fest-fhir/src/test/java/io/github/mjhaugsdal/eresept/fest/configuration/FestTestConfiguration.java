package io.github.mjhaugsdal.eresept.fest.configuration;

import org.apache.cxf.feature.Feature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.util.TestSocketUtils;

import java.util.ArrayList;
import java.util.List;

@Configuration
@SpringBootApplication
@BootstrapWith(SpringBootTestContextBootstrapper.class)
@ContextConfiguration(initializers = ConfigDataApplicationContextInitializer.class)
public class FestTestConfiguration {

    static {
        System.setProperty("soap.address", "http://localhost:" + TestSocketUtils.findAvailableTcpPort());
    }

    @Value("${soap.address}")
    String address;

    List<Feature> featureList = new ArrayList<>();

//    @Bean
//    public Server festEndpoint() {

//        var bean = new JaxWsServerFactoryBean();
//        bean.setServiceBean(new FestService());
//        bean.setBindingId(SOAPBinding.SOAP12HTTP_BINDING);
//        bean.setAddress(address);
//
//        featureList.add(new WSAddressingFeature());
//
//        var loggingFeature = new LoggingFeature();
//        loggingFeature.setPrettyLogging(true);
//        featureList.add(loggingFeature);
//
//        bean.setFeatures(featureList);
//        return bean.create();
//    }
}
