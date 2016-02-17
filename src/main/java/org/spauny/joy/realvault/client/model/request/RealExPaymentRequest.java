package org.spauny.joy.realvault.client.model.request;

import java.lang.reflect.InvocationTargetException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;
import org.spauny.joy.realvault.client.model.internal.RealExAmount;
import org.spauny.joy.realvault.client.model.internal.RealExComments;
import org.spauny.joy.realvault.client.model.internal.RealExDCCInfo;
import org.spauny.joy.realvault.client.model.internal.RealExMPI;
import org.spauny.joy.realvault.client.model.internal.RealExSupplementaryData;
import org.spauny.joy.realvault.client.model.internal.RealExTSSInfo;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class RealExPaymentRequest implements RealExRequest {

    @XmlAttribute(name = "type", required = true)
    private String type;

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

    @XmlElement(name = "sha1hash", required = true)
    private String sha1hash;

    @XmlElement(name = "orderid")
    private String orderId;
    
    
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

        private String timestamp;
        private String merchantId;
        private String account;
        private RealExAmount amount;
        private String payerRef;
        private String paymentmethod;
        private String sha1hash;
        private String orderId;
        
        
        private RealExMPI mpi;
        private RealExDCCInfo dccInfo;
        private RealExComments comments;
        private RealExTSSInfo tssinfo;
        private RealExSupplementaryData supplementaryData;

        private Builder() {
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

        public Builder sha1hash(final String value) {
            this.sha1hash = value;
            return this;
        }

        public Builder orderId(final String value) {
            this.orderId = value;
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

        public <T> T build(Class<T> objectClass) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            return objectClass.getConstructor(String.class, String.class, String.class, RealExAmount.class, String.class, 
                    String.class, String.class, String.class, 
                    RealExMPI.class, RealExDCCInfo.class, RealExComments.class, RealExTSSInfo.class, RealExSupplementaryData.class)
                    .newInstance(timestamp, merchantId, account, amount, payerRef, paymentmethod, sha1hash, orderId,
                    mpi, dccInfo, comments, tssinfo, supplementaryData);
        }
    }
    
    private static Class<?> getClassOrNull(Object obj) {
        return obj != null ? obj.getClass() : null;
    }

    public static RealExPaymentRequest.Builder builder() {
        return new RealExPaymentRequest.Builder();
    }

}
