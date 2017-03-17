package com.lindar.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.lindar.realvault.client.model.internal.RealExCard;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExDeleteCardRequest implements RealExRequest {

    private static final long serialVersionUID = -8695462590806433483L;

    @XmlAttribute(name = "type", required = true)
    private String type = "card-cancel-card";

    @XmlAttribute(name = "timestamp", required = true)
    private String timestamp;

    @XmlElement(name = "merchantid", required = true)
    private String merchantId;

    @XmlElement(required = true)
    private RealExCard card;
    
    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;
    
    // This will be used only internally to identify the realex conversation request
    private String orderId;

    public static class Builder {

        private String type = "card-cancel-card";
        private String timestamp;
        private String merchantId;
        private RealExCard card;
        private String sha1hash;
        private String orderId;

        private Builder() {
        }

        public Builder type(final String value) {
            this.type = value;
            return this;
        }

        public Builder timestamp(final String value) {
            this.timestamp = value;
            return this;
        }

        public Builder merchantId(final String value) {
            this.merchantId = value;
            return this;
        }

        public Builder card(final RealExCard value) {
            this.card = value;
            return this;
        }

        public Builder sha1hash(final String value) {
            this.sha1hash = value;
            return this;
        }
        
        public Builder orderId(final String value) {
            this.orderId = value;
            return this;
        }

        public RealExDeleteCardRequest build() {
            return new com.lindar.realvault.client.model.request.RealExDeleteCardRequest(type, timestamp, merchantId, card, sha1hash, orderId);
        }
    }

    public static RealExDeleteCardRequest.Builder builder() {
        return new RealExDeleteCardRequest.Builder();
    }

}
