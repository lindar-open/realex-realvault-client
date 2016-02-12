package org.spauny.joy.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spauny.joy.realvault.client.model.internal.RealExAmount;
import org.spauny.joy.realvault.client.model.internal.RealExAutoSettle;
import org.spauny.joy.realvault.client.model.internal.RealExComments;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealEx3DSecuredEnabledRequest implements RealExRequest {

    private static final long serialVersionUID = -3773912045971606471L;

    @XmlAttribute(name = "type", required = true)
    private String type = "realvault-3ds-verifyenrolled";
    
    @XmlAttribute(name = "timestamp", required = true)
    private String timestamp;

    @XmlElement(name = "merchantid", required = true)
    private String merchantId;

    @XmlElement(name = "account", required = true)
    private String account;

    @XmlElement(required = true)
    private RealExAmount amount;

    @XmlElement(name = "payerref", required = true)
    private String payerRef;

    @XmlElement(name = "paymentmethod", required = true)
    private String paymentmethod;

    @XmlElement(required = true)
    private RealExAutoSettle autoSettle;

    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;

    @XmlElement(name = "orderid")
    private String orderId;
    
    @XmlElement
    private RealExComments comments;
}
