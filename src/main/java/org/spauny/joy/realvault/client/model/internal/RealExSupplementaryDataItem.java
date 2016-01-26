package org.spauny.joy.realvault.client.model.internal;

import java.util.List;
import java.util.Map;

import org.spauny.joy.realvault.client.annotations.TagAttribute;
import org.spauny.joy.realvault.client.annotations.TagName;
import org.spauny.joy.realvault.client.annotations.TagValue;

@TagName(name="item")
public class RealExSupplementaryDataItem  extends RealExBean{
	@TagAttribute(name="type")
	protected String type;
	
	@TagName(name="field",isSuffixIncremental="incremental")
	protected List<String> fields;

	@TagValue
	protected Map<String,String> fieldMap;

	
	
	/**
	 * @return the fieldMap
	 */
	public Map<String, String> getFieldMap() {
		return fieldMap;
	}

	/**
	 * @param fieldMap the fieldMap to set
	 */
	public void setFieldMap(Map<String, String> fieldMap) {
		this.fieldMap = fieldMap;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the fields
	 */
	public List<String> getFields() {
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public RealExSupplementaryDataItem(String type, List<String> fields) {
		super();
		this.type = type;
		this.fields = fields;
	}

	public RealExSupplementaryDataItem(String type, Map<String, String> fieldMap) {
		super();
		this.type = type;
		this.fieldMap = fieldMap;
	}
	
	
	
	

}
