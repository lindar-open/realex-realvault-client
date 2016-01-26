package org.spauny.joy.realvault.client.model.request;

import org.spauny.joy.realvault.client.model.internal.RealExCard;
import org.spauny.joy.realvault.client.annotations.TagAttribute;
import org.spauny.joy.realvault.client.annotations.TagName;
import org.spauny.joy.realvault.client.annotations.TagValue;

@TagName(name="request")
public class RealExAddCardRequest extends RealExRequest{
	@TagAttribute(name="type")
	protected String type="card-new";
	@TagAttribute(name="timestamp")
	protected String timestamp;
	@TagName(name="merchantid")
	protected String merchantId;
	@TagName(name="orderid")
	protected String orderId;
	@TagValue
	protected RealExCard card;
	@TagName(name="sha1hash")
	protected String sha1hash;
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
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}
	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the card
	 */
	public RealExCard getCard() {
		return card;
	}
	/**
	 * @param card the card to set
	 */
	public void setCard(RealExCard card) {
		this.card = card;
	}
	/**
	 * @return the sha1hash
	 */
	public String getSha1hash() {
		return sha1hash;
	}
	/**
	 * @param sha1hash the sha1hash to set
	 */
	public void setSha1hash(String sha1hash) {
		this.sha1hash = sha1hash;
	}
	public RealExAddCardRequest( String timestamp,
			String merchantId, String orderId, RealExCard card, String sha1hash) {
		super();
		
		this.timestamp = timestamp;
		this.merchantId = merchantId;
		this.orderId = orderId;
		this.card = card;
		this.sha1hash = sha1hash;
	}
	
	
	
	
	

}
