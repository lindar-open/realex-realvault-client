package org.spauny.joy.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spauny.joy.realvault.client.model.internal.RealExCard;
import org.spauny.joy.realvault.client.model.internal.RealExComments;
import org.spauny.joy.realvault.client.model.internal.RealExPayer;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExSetupNewPayerRequest implements RealExRequest {

    private static final long serialVersionUID = 22833453374673833L;

    @XmlAttribute(name = "type", required = true)
    private String type = "payer-new";

    @XmlAttribute(name = "timestamp", required = true)
    private String timestamp;

    @XmlElement(name = "merchantid", required = true)
    private String merchantId;

    @XmlElement(required = true)
    private RealExCard card;

    @XmlElement(name = "orderid")
    private String orderId;

    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;

    @XmlElement
    private RealExPayer payer;

    @XmlElement
    private RealExComments comments;
}
