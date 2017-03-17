package com.lindar.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "phonenumbers")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExPayerPhoneNumbers implements Serializable {

    private static final long serialVersionUID = 1812235194389087396L;
    
    @XmlElement(name = "home")
    private String home;
    @XmlElement(name = "work")
    private String work;
    @XmlElement(name = "fax")
    private String fax;
    @XmlElement(name = "mobile")
    private String mobile;
}
