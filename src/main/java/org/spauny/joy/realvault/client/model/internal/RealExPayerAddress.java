package org.spauny.joy.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
public class RealExPayerAddress implements Serializable {

    private static final long serialVersionUID = 7231181306574014991L;

    @XmlElement(name = "line1")
    private String line1;
    @XmlElement(name = "line2")
    private String line2;
    @XmlElement(name = "line3")
    private String line3;
    @XmlElement(name = "city")
    private String city;
    @XmlElement(name = "county")
    private String county;
    @XmlElement(name = "postcode")
    private String postcode;
    @XmlElement
    private RealExCountryCode countryCode;
}
