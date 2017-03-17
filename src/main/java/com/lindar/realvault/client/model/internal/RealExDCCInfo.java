package com.lindar.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name="dccinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExDCCInfo implements Serializable {

    private static final long serialVersionUID = -5660817956328428287L;
    
	@XmlElement(name="ccp")
	private String ccp;
	@XmlElement(name="type")
	private String type;
	@XmlElement(name="rate")
	private String rate;
	@XmlElement(name="ratetype")
	private String ratetype;
	@XmlElement
	private RealExAmount amount;
	
	public RealExDCCInfo(String ccp, String type, String rate, String ratetype) {
		super();
		this.ccp = ccp;
		this.type = type;
		this.rate = rate;
		this.ratetype = ratetype;
	}
        
	public RealExDCCInfo(String ccp, String type) {
		super();
		this.ccp = ccp;
		this.type = type;
	}
	
	
	

}
