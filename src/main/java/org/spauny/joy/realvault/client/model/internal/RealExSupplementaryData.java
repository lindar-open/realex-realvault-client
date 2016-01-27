package org.spauny.joy.realvault.client.model.internal;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "supplementarydata")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExSupplementaryData implements Serializable {

    private static final long serialVersionUID = 6739965511704923755L;

    @XmlElement(name = "item")
    private List<RealExSupplementaryDataItem> item;

}
