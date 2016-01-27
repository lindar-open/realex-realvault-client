package org.spauny.joy.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "mpi")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExMPI implements Serializable {

    private static final long serialVersionUID = 8579068452203929578L;

    @XmlElement(name = "cavv")
    private String cavv;

    @XmlElement(name = "xid")
    private String xid;

    @XmlElement(name = "eci")
    private String eci;

}
