package io.github.mjhaugsdal.soap.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.ReadHeadersInterceptor;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.apache.cxf.helpers.HttpHeaderHelper.AUTHORIZATION;

public class AuthInterceptor extends AbstractSoapInterceptor {

    public AuthInterceptor() {
        super(Phase.READ);
        addAfter(ReadHeadersInterceptor.class.getName());
    }


    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        Map<String, List<String>> headers = CastUtils.cast((Map<String, List<String>>)message.get(Message.PROTOCOL_HEADERS));
        var authHeader = headers.get(AUTHORIZATION);
        var token = Arrays.stream((authHeader.get(0).split(" "))).toList().get(1);
        System.out.println(token);
        message.getExchange().put("auth", token);
    }
}
