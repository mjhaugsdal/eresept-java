package io.nettapotek.rest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.jaxrs.xml.JacksonJaxbXMLProvider;
import io.nettapotek.rest.hack.types.M9Na1;
import io.nettapotek.rest.hack.types.M9Na2;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.rs.security.jose.jaxrs.*;
import org.apache.cxf.rs.security.jose.jaxrs.multipart.JwsMultipartClientRequestFilter;
import org.apache.cxf.rs.security.jose.jaxrs.multipart.JwsMultipartSignatureOutFilter;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBContext;

public class RestClientTest {
    @Test
    void testOKResponse() throws Exception {

        new NaWebServiceImpl();

        M9Na1 m9Na1 = new M9Na1();
        m9Na1.setDokument("Hello world!".getBytes(StandardCharsets.UTF_8));

        var bean = new JAXRSClientFactoryBean();
        bean.setAddress("http://localhost:8890/m9na1");
        bean.setResourceClass(NaWebService.class);

        LoggingFeature loggingFeature = new LoggingFeature();
        loggingFeature.setPrettyLogging(true);
        bean.getFeatures().add(loggingFeature);

        JweWriterInterceptor jweWriterInterceptor = new JweWriterInterceptor();
        jweWriterInterceptor.setUseJweOutputStream(true);

        var jwsWriterInterceptor = new JwsWriterInterceptor();
        //jwsWriterInterceptor.setUseJwsOutputStream(true);


        JweClientResponseFilter jweClientResponseFilter = new JweClientResponseFilter();
        JwsClientResponseFilter jwsClientResponseFilter = new JwsClientResponseFilter();

        List<Object> providers = new LinkedList<>();
        providers.add(jwsWriterInterceptor);
        providers.add(jweWriterInterceptor);
        providers.add(jweClientResponseFilter);
        providers.add(jwsClientResponseFilter);

        bean.setProviders(providers);

        bean.getProperties(true).put(
            "rs.security.encryption.out.properties",
            "client/client.properties"
        );
        bean.getProperties(true).put(
            "rs.security.signature.out.properties",
            "client/client-sign.properties"
        );
        bean.getProperties(true).put(
            "rs.security.encryption.in.properties",
            "client/client-in.properties"
        );
        bean.getProperties(true).put(
            "rs.security.signature.in.properties",
            "client/client-in-sign.properties"
        );
        bean.getProperties(true).put("jose.debug", true);

        WebClient client = bean.createWebClient()
            .type("application/xml; charset=UTF-8")
            .encoding("UTF-8");

        client.encoding("UTF-8");
        var response = client.post(m9Na1);
        //var bais = (ByteArrayInputStream) response.getEntity();
        //var msgBytes = bais.readAllBytes();

        JAXBContext jaxbContext = JAXBContext.newInstance(M9Na2.class);
        var um = jaxbContext.createUnmarshaller();
        var m9na2 = (M9Na2) um.unmarshal((InputStream) response.getEntity());

        var byteDokument = m9na2.getDokument();


        System.out.println("");
    }

    @Test
    void testOKResponseJWK() throws Exception {

        new NaWebServiceImpl();

        M9Na1 m9Na1 = new M9Na1();
        m9Na1.setDokument("Hello world!".getBytes(StandardCharsets.UTF_8));

        var bean = new JAXRSClientFactoryBean();
        bean.setAddress("http://localhost:8890/m9na1");
        bean.setResourceClass(NaWebService.class);

        LoggingFeature loggingFeature = new LoggingFeature();
        loggingFeature.setPrettyLogging(true);
        bean.getFeatures().add(loggingFeature);

        JweWriterInterceptor jweWriterInterceptor = new JweWriterInterceptor();
        jweWriterInterceptor.setUseJweOutputStream(true);

        var jwsWriterInterceptor = new JwsWriterInterceptor();
        //jwsWriterInterceptor.setUseJwsOutputStream(true);

        JweClientResponseFilter jweClientResponseFilter = new JweClientResponseFilter();
        JwsClientResponseFilter jwsClientResponseFilter = new JwsClientResponseFilter();

        List<Object> providers = new LinkedList<>();
        providers.add(jwsWriterInterceptor);
        providers.add(jweWriterInterceptor);
        providers.add(jweClientResponseFilter);
        providers.add(jwsClientResponseFilter);

        bean.setProviders(providers);

        bean.getProperties(true).put(
                "rs.security.encryption.out.properties",
                "client/jwk/client.properties"
        );
        bean.getProperties(true).put(
                "rs.security.signature.out.properties",
                "client/jwk/client-sign.properties"
        );
        bean.getProperties(true).put(
                "rs.security.encryption.in.properties",
                "client/jwk/client-in.properties"
        );
        bean.getProperties(true).put(
                "rs.security.signature.in.properties",
                "client/jwk/client-in-sign.properties"
        );
        bean.getProperties(true).put("jose.debug", true);
        bean.getProperties(true).put("rs.security.accept.public.key", "true");

        WebClient client = bean.createWebClient()
                .type("application/xml; charset=UTF-8")
                .encoding("UTF-8");

        client.encoding("UTF-8");
        var response = client.post(m9Na1);
        //var bais = (ByteArrayInputStream) response.getEntity();
        //var msgBytes = bais.readAllBytes();

        JAXBContext jaxbContext = JAXBContext.newInstance(M9Na2.class);
        var um = jaxbContext.createUnmarshaller();
        var m9na2 = (M9Na2) um.unmarshal((InputStream) response.getEntity());

        var byteDokument = m9na2.getDokument();


        System.out.println("");
    }
}