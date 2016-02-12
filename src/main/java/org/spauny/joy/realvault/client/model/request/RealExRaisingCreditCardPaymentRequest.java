package org.spauny.joy.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spauny.joy.realvault.client.model.internal.RealExAmount;
import org.spauny.joy.realvault.client.model.internal.RealExAutoSettle;
import org.spauny.joy.realvault.client.model.internal.RealExComments;
import org.spauny.joy.realvault.client.model.internal.RealExDCCInfo;
import org.spauny.joy.realvault.client.model.internal.RealExMPI;
import org.spauny.joy.realvault.client.model.internal.RealExPaymentData;
import org.spauny.joy.realvault.client.model.internal.RealExSupplementaryData;
import org.spauny.joy.realvault.client.model.internal.RealExTSSInfo;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExRaisingCreditCardPaymentRequest implements RealExRequest {

    private static final long serialVersionUID = 1304033126562317761L;

    @XmlAttribute(name = "type", required = true)
    private String type = "receipt-in";

    @XmlAttribute(name = "timestamp", required = true)
    private String timestamp;

    @XmlElement(name = "merchantid", required = true)
    private String merchantId;

    @XmlElement(name = "account", required = true)
    private String account;

    @XmlElement(required = true)
    private RealExAmount amount;

    @XmlElement(name = "payerref", required = true)
    private String payerRef;

    @XmlElement(name = "paymentmethod", required = true)
    private String paymentmethod;

    @XmlElement(required = true)
    private RealExAutoSettle autoSettle;

    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;

    @XmlElement(name = "orderid")
    private String orderId;

    @XmlElement
    private RealExPaymentData paymentData;

    @XmlElement
    private RealExMPI mpi;

    @XmlElement
    private RealExDCCInfo dccInfo;

    @XmlElement
    private RealExComments comments;

    @XmlElement
    private RealExTSSInfo tssinfo;

    @XmlElement
    private RealExSupplementaryData supplementaryData;

    public static class Builder {

        private String type = "receipt-in";
        private String timestamp;
        private String merchantId;
        private String account;
        private RealExAmount amount;
        private String payerRef;
        private String paymentmethod;
        private RealExAutoSettle autoSettle;
        private String sha1hash;
        private String orderId;
        private RealExPaymentData paymentData;
        private RealExMPI mpi;
        private RealExDCCInfo dccInfo;
        private RealExComments comments;
        private RealExTSSInfo tssinfo;
        private RealExSupplementaryData supplementaryData;

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

        public Builder account(final String value) {
            this.account = value;
            return this;
        }

        public Builder amount(final RealExAmount value) {
            this.amount = value;
            return this;
        }

        public Builder payerRef(final String value) {
            this.payerRef = value;
            return this;
        }

        public Builder paymentmethod(final String value) {
            this.paymentmethod = value;
            return this;
        }

        public Builder autoSettle(final RealExAutoSettle value) {
            this.autoSettle = value;
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

        public Builder paymentData(final RealExPaymentData value) {
            this.paymentData = value;
            return this;
        }

        public Builder mpi(final RealExMPI value) {
            this.mpi = value;
            return this;
        }

        public Builder dccInfo(final RealExDCCInfo value) {
            this.dccInfo = value;
            return this;
        }

        public Builder comments(final RealExComments value) {
            this.comments = value;
            return this;
        }

        public Builder tssinfo(final RealExTSSInfo value) {
            this.tssinfo = value;
            return this;
        }

        public Builder supplementaryData(final RealExSupplementaryData value) {
            this.supplementaryData = value;
            return this;
        }

        public RealExRaisingCreditCardPaymentRequest build() {
            return new org.spauny.joy.realvault.client.model.request.RealExRaisingCreditCardPaymentRequest(type, timestamp, merchantId, account, amount, payerRef, paymentmethod, autoSettle, sha1hash, 
                    orderId, paymentData, mpi, dccInfo, comments, tssinfo, supplementaryData);
        }
    }

    public static RealExRaisingCreditCardPaymentRequest.Builder builder() {
        return new RealExRaisingCreditCardPaymentRequest.Builder();
    }

}
