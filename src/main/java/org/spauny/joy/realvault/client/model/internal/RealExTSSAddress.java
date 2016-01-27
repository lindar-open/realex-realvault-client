package org.spauny.joy.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExTSSAddress implements Serializable {

    private static final long serialVersionUID = 7807568684306870865L;

    @XmlAttribute(name = "type")
    private String type;

    @XmlElement(name = "code")
    private String code;

    @XmlElement(name = "country")
    private String country;

}
