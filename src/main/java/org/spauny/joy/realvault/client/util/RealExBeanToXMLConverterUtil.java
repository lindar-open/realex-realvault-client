package org.spauny.joy.realvault.client.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.spauny.joy.realvault.client.model.response.RealExResponse;

public class RealExBeanToXMLConverterUtil {

    public static RealExResponse toResponseBean(String xml) throws Exception {
        RealExResponse retVal = null;
        Document document = DocumentHelper.parseText(xml);
        Node response = document.selectSingleNode("/response");
        if (response != null) {
            String timestamp = (document.selectSingleNode("/response") != null) ? document.selectSingleNode("/response").valueOf("@timestamp") : null;
            String merchantId = (document.selectSingleNode("/response/merchantid") != null) ? document.selectSingleNode("/response/merchantid").getText() : null;
            String account = (document.selectSingleNode("/response/account") != null) ? document.selectSingleNode("/response/account").getText() : null;
            String orderId = (document.selectSingleNode("/response/orderid") != null) ? document.selectSingleNode("/response/orderid").getText() : null;
            String result = (document.selectSingleNode("/response/result") != null) ? document.selectSingleNode("/response/result").getText() : null;
            String message = (document.selectSingleNode("/response/message") != null) ? document.selectSingleNode("/response/message").getText() : null;
            String pasref = (document.selectSingleNode("/response/pasref") != null) ? document.selectSingleNode("/response/pasref").getText() : null;
            String authcode = (document.selectSingleNode("/response/authcode") != null) ? document.selectSingleNode("/response/authcode").getText() : null;
            String batchId = (document.selectSingleNode("/response/batchid") != null) ? document.selectSingleNode("/response/batchid").getText() : null;
            String timetaken = (document.selectSingleNode("/response/timetaken") != null) ? document.selectSingleNode("/response/timetaken").getText() : null;
            String processingtimetaken = (document.selectSingleNode("/response/processingtimetaken") != null) ? document.selectSingleNode("/response/processingtimetaken").getText() : null;
            String md5hash = (document.selectSingleNode("/response/md5hash") != null) ? document.selectSingleNode("/response/md5hash").getText() : null;
            String sha1hash = (document.selectSingleNode("/response/sha1hash") != null) ? document.selectSingleNode("/response/sha1hash").getText() : null;

            retVal = new RealExResponse(timestamp, merchantId, account, orderId, result, message, pasref, authcode, batchId, timetaken, processingtimetaken, md5hash, sha1hash);
        }

        return retVal;
    }

    private RealExBeanToXMLConverterUtil() {
    }

}
