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

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExDeleteCardRequest implements RealExRequest {

    private static final long serialVersionUID = -8695462590806433483L;

    @XmlAttribute(name = "type", required = true)
    private String type = "card-cancel-card";

    @XmlAttribute(name = "timestamp", required = true)
    private String timestamp;

    @XmlElement(name = "merchantid", required = true)
    private String merchantId;

    @XmlElement(required = true)
    private RealExCard card;
    
    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;
}
