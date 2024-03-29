package io.github.mjhaugsdal.rest.configuration;


import io.github.mjhaugsdal.rest.NaWebService;
import io.github.mjhaugsdal.rest.RekvirentWebService;
import io.github.mjhaugsdal.rest.UtlevererWebService;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.rs.security.jose.jaxrs.JweClientResponseFilter;
import org.apache.cxf.rs.security.jose.jaxrs.JweWriterInterceptor;
import org.apache.cxf.rs.security.jose.jaxrs.JwsClientResponseFilter;
import org.apache.cxf.rs.security.jose.jaxrs.JwsWriterInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Configuration
public class RestConfiguration {

    @Value("${rest.na.address}")
    String naAddress;

    @Value("${rest.rekvirent.address}")
    String rekvirentAddress;

    @Value("${rest.utleverer.address}")
    String utlevererAddress;

    @Value("${use.jwk}")
    String jwk;

    @Bean
    public NaWebService naWebService() {
        var jaxrsClientFactoryBean = new JAXRSClientFactoryBean();
        jaxrsClientFactoryBean.setServiceClass(NaWebService.class);
        jaxrsClientFactoryBean.setAddress(naAddress + "/NA"); //TODO portkonfig
        setupCommon(jaxrsClientFactoryBean, jwk);
        return (NaWebService) jaxrsClientFactoryBean.create();
    }

    @Bean
    public RekvirentWebService rekvirentWebService() {
        var jaxrsClientFactoryBean = new JAXRSClientFactoryBean();
        jaxrsClientFactoryBean.setServiceClass(RekvirentWebService.class);
        jaxrsClientFactoryBean.setAddress(rekvirentAddress + "/Rekvirent"); //TODO portkonfig
        setupCommon(jaxrsClientFactoryBean, jwk);
        return (RekvirentWebService) jaxrsClientFactoryBean.create();
    }

    @Bean
    public UtlevererWebService utlevererWebService() {
        var jaxrsClientFactoryBean = new JAXRSClientFactoryBean();
        jaxrsClientFactoryBean.setServiceClass(UtlevererWebService.class);
        jaxrsClientFactoryBean.setAddress(utlevererAddress + "/Utleverer"); //TODO portkonfig
        setupCommon(jaxrsClientFactoryBean, jwk);
        return (UtlevererWebService) jaxrsClientFactoryBean.create();
    }

    private static void setupCommon(JAXRSClientFactoryBean jaxrsClientFactoryBean, String jwk) {
        List<Feature> featureList = new ArrayList<>();
        List<Object> providers = new LinkedList<>();
        var loggingFeature = new LoggingFeature();
        loggingFeature.setPrettyLogging(true);
        featureList.add(loggingFeature);
        jaxrsClientFactoryBean.setFeatures(featureList);

        var jweWriterInterceptor = new JweWriterInterceptor();
        var jwsWriterInterceptor = new JwsWriterInterceptor();
        var jweClientResponseFilter = new JweClientResponseFilter();
        var jwsClientResponseFilter = new JwsClientResponseFilter();

        providers.add(jwsWriterInterceptor);
        providers.add(jweWriterInterceptor);
        providers.add(jweClientResponseFilter);
        providers.add(jwsClientResponseFilter);
        providers.add("com.fasterxml.jackson.jaxrs.xml.JacksonJaxbXMLProvider");

        jaxrsClientFactoryBean.setProviders(providers);

        if (Boolean.parseBoolean(jwk)) {
            //ENCRYPTION properties
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.encryption.in.properties",
                    "client/jwk/client-in.properties"
            );
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.encryption.out.properties",
                    "client/jwk/client.properties"
            );
            //SIGNATURE IN
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.signature.in.properties",
                    "client/jwk/client-in-sign.properties"
            );
            //SIGNATURE OUT
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.signature.out.properties",
                    "client/jwk/client-sign.properties"
            );

            jaxrsClientFactoryBean.getProperties(true).put("rs.security.accept.public.key", "true");
            jaxrsClientFactoryBean.getProperties(true).put("rs.security.signature.include.public.key", "true");
        } else {
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.encryption.out.properties",
                    "client/client.properties"
            );
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.signature.out.properties",
                    "client/client-sign.properties"
            );
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.encryption.in.properties",
                    "client/client-in.properties"
            );
            jaxrsClientFactoryBean.getProperties(true).put(
                    "rs.security.signature.in.properties",
                    "client/client-in-sign.properties"
            );
            jaxrsClientFactoryBean.getProperties(true).put("rs.security.signature.include.cert", "true");
        }
        jaxrsClientFactoryBean.getProperties(true).put("jose.debug", true);
    }
}
