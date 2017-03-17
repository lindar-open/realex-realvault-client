package com.lindar.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "tssinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExTSSInfo implements Serializable {

    private static final long serialVersionUID = -7125707384976754467L;

    @XmlElement
    private RealExTSSAddress billing;
    @XmlElement
    private RealExTSSAddress shipping;

    @XmlElement(name = "custnum")
    private String custNum;
    @XmlElement(name = "varref")
    private String varref;
    @XmlElement(name = "prodid")
    private String prodid;

    public RealExTSSInfo(RealExTSSAddress billing, RealExTSSAddress shipping) {
        super();
        this.billing = billing;
        this.shipping = shipping;
    }

}
