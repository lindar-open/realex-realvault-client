package com.lindar.realvault.client.model.internal;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExSupplementaryDataItem implements Serializable {

    private static final long serialVersionUID = -3977333746689503569L;

    @XmlAttribute(name = "type")
    private String type;

    @XmlElement(name = "field") // TODO ,isSuffixIncremental="incremental"
    private List<String> fields;

//    @XmlValue
//    private Map<String, String> fieldMap;

}
