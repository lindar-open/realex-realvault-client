package com.lindar.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.lindar.realvault.client.model.internal.RealExComments;
import com.lindar.realvault.client.model.internal.RealExPayer;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExEditExistingPayerRequest implements RealExRequest {

    private static final long serialVersionUID = 8614054377158078010L;

    @XmlAttribute(name = "type")
    private String type;

    @XmlAttribute(name = "timestamp", required = true)
    private String timestamp;

    @XmlElement(name = "merchantid", required = true)
    private String merchantId;

    @XmlElement(name = "payer", required = true)
    private RealExPayer payer;

    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;

    @XmlElement(name = "orderid")
    private String orderId;

    @XmlElement
    private RealExComments comments;

}
