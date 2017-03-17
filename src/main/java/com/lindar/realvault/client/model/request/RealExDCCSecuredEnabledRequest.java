package com.lindar.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.lindar.realvault.client.model.internal.RealExAmount;
import com.lindar.realvault.client.model.internal.RealExComments;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExDCCSecuredEnabledRequest implements RealExRequest {

    private static final long serialVersionUID = -4749644529209236747L;

    @XmlAttribute(name = "type", required = true)
    private String type = "card-cancel-card";

    @XmlAttribute(name = "timestamp", required = true)
    private String timestamp;

    @XmlElement(name = "merchantid", required = true)
    private String merchantId;

    @XmlElement(name = "account", required = true)
    private String account;

    @XmlElement(name = "orderid")
    private String orderId;

    @XmlElement(name = "payerref", required = true)
    private String payerRef;

    @XmlElement(name = "paymentmethod", required = true)
    private String paymentmethod;

    @XmlElement(name = "amount", required = true)
    private RealExAmount amount;

    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;
    
    @XmlElement
    private RealExComments comments;
}
