package com.lindar.realvault.client.model.internal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "payer")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExPayer implements Serializable {
	@XmlAttribute(name="type")
	private String type;
	@XmlAttribute(name="ref")
	private String ref;
	@XmlElement(name="title")
	private String title;
	@XmlElement(name="firstname")
	private String firstName;
	@XmlElement(name="surname")
	private String surName;
	@XmlElement(name="company")
	private String company;
	@XmlElement
	private RealExPayerAddress address;
	@XmlElement
	private RealExPayerPhoneNumbers phoneNumbers;
	@XmlElement(name="email")
	private String email;
	@XmlElement
	private RealExComments comments;
}
