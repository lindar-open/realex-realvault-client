package com.lindar.realvault.client;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import com.lindar.realvault.client.model.response.RealExResponse;
import com.lindar.realvault.client.util.RealExBeanToXMLConverterUtil;

public class RealExClient {

    public static RealExResponse postRequestAndGetResponse(String url, String requestXml) throws Exception {
        RealExResponse retVal = RealExBeanToXMLConverterUtil.toResponseBean(
                Request.Post(url).bodyString(requestXml, ContentType.APPLICATION_XML)
                .execute().returnContent().asString());

        return retVal;
    }

    private RealExClient() {
    }

}
