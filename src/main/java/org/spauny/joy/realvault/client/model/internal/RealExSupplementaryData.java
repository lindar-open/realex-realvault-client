package org.spauny.joy.realvault.client.model.internal;

import java.util.List;

import org.spauny.joy.realvault.client.annotations.TagName;

@TagName(name="supplementarydata")
public class RealExSupplementaryData extends RealExBean{
	
	@TagName(name="item")
	protected List<RealExSupplementaryDataItem> item;

	/**
	 * @return the item
	 */
	public List<RealExSupplementaryDataItem> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<RealExSupplementaryDataItem> item) {
		this.item = item;
	}

	public RealExSupplementaryData(List<RealExSupplementaryDataItem> item) {
		super();
		this.item = item;
	}
	
	
	

}
