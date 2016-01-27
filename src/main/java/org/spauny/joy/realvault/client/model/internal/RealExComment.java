package org.spauny.joy.realvault.client.model.internal;

import java.io.Serializable;
import org.spauny.joy.realvault.client.annotations.TagAttribute;
import org.spauny.joy.realvault.client.annotations.TagName;
import org.spauny.joy.realvault.client.annotations.TagValue;

@TagName(name="comment")
public class RealExComment implements Serializable {
	@TagAttribute(name="id")
	protected String id;
	@TagValue
	protected String comment;
	
	
	public RealExComment(String id, String comment) {
		super();
		this.id = id;
		this.comment = comment;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
