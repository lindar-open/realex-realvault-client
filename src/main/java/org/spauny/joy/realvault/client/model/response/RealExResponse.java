package org.spauny.joy.realvault.client.model.response;

import lombok.Data;
import org.spauny.joy.realvault.client.model.internal.RealExBean;

@Data
public class RealExResponse extends RealExBean {

    private static final long serialVersionUID = -8294328990441372627L;

    private String timestamp;

    private String merchantId;

    private String account;

    private String orderId;

    private String result;

    private String message;

    private String pasref;

    private String authcode;

    private String batchId;

    private String timetaken;

    private String processingtimetaken;

    private String md5hash;

    private String sha1hash;

    public RealExResponse(String timestamp, String merchantId, String account,
            String orderId, String result, String message, String pasref,
            String authcode, String batchId, String timetaken,
            String processingtimetaken, String md5hash, String sha1hash) {
        super();
        this.timestamp = timestamp;
        this.merchantId = merchantId;
        this.account = account;
        this.orderId = orderId;
        this.result = result;
        this.message = message;
        this.pasref = pasref;
        this.authcode = authcode;
        this.batchId = batchId;
        this.timetaken = timetaken;
        this.processingtimetaken = processingtimetaken;
        this.md5hash = md5hash;
        this.sha1hash = sha1hash;
    }

}
