package org.spauny.joy.realvault.client.model.request;

import org.spauny.joy.realvault.client.model.internal.RealExComments;
import org.spauny.joy.realvault.client.model.internal.RealExPayer;
import org.spauny.joy.realvault.client.annotations.TagAttribute;
import org.spauny.joy.realvault.client.annotations.TagName;
import org.spauny.joy.realvault.client.annotations.TagValue;

@TagName(name="request")
public class RealExEditExistingPayerRequest extends RealExRequest{
	@TagAttribute(name="type")
	protected String type;
	@TagAttribute(name="timestamp")
	protected String timestamp;
	@TagName(name="merchantid")
	protected String merchantId;
	@TagName(name="orderid")
	protected String orderId;
	@TagValue
	protected RealExPayer payer;
	
	@TagName(name="sha1hash")
	protected String sha1hash;
	@TagValue
	protected RealExComments comments;
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
	/**
	 * @return the payer
	 */
	public RealExPayer getPayer() {
		return payer;
	}
	/**
	 * @param payer the payer to set
	 */
	public void setPayer(RealExPayer payer) {
		this.payer = payer;
	}
	/**
	 * @return the comments
	 */
	public RealExComments getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(RealExComments comments) {
		this.comments = comments;
	}
	public RealExEditExistingPayerRequest( String timestamp,
			String merchantId, String orderId, String sha1hash,
			RealExPayer payer, RealExComments comments) {
		super();
		
		this.timestamp = timestamp;
		this.merchantId = merchantId;
		this.orderId = orderId;
		this.sha1hash = sha1hash;
		this.payer = payer;
		this.comments = comments;
	}
	
	
	
	

}
