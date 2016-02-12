package org.spauny.joy.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "card")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExCard implements Serializable {

    private static final long serialVersionUID = 9095101816631273931L;

    @XmlElement(name = "ref", required = true)
    private String ref;

    @XmlElement(name = "payerref", required = true)
    private String payerRef;
}
