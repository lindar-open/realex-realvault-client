package org.spauny.joy.realvault.client.util;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.spauny.joy.realvault.client.model.response.RealExResponse;

public class RealExHttpUtil {

    public static RealExResponse postRequestAndGetResponse(String url, String requestXml) throws Exception {
        RealExResponse retVal = RealExBeanToXMLConverterUtil.toResponseBean(
                Request.Post(url).bodyString(requestXml, ContentType.APPLICATION_XML)
                .execute().returnContent().asString());

        return retVal;
    }

    private RealExHttpUtil() {
    }

}
