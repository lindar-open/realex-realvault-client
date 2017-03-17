package com.lindar.realvault.client.model.response;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExResponse implements Serializable {

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


}
