package org.spauny.joy.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import org.spauny.joy.realvault.client.model.internal.RealExAmount;
import org.spauny.joy.realvault.client.model.internal.RealExComments;
import org.spauny.joy.realvault.client.model.internal.RealExDCCInfo;
import org.spauny.joy.realvault.client.model.internal.RealExMPI;
import org.spauny.joy.realvault.client.model.internal.RealExSupplementaryData;
import org.spauny.joy.realvault.client.model.internal.RealExTSSInfo;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
public class RealExRaisingRefundRequest extends RealExPaymentRequest {

    private static final long serialVersionUID = 1041308714898250850L;

    private static final String TYPE = "payment-out";

    @Getter
    @XmlElement(name = "refundhash", required = true)
    private String refundhash;


    public RealExRaisingRefundRequest(String timestamp, String merchantId, String account, RealExAmount amount, String payerRef, String paymentmethod,
            String sha1hash, String orderId, RealExMPI mpi, RealExDCCInfo dccInfo, RealExComments comments, RealExTSSInfo tssinfo, RealExSupplementaryData supplementaryData) {
        setType(TYPE);
        setTimestamp(timestamp);
        setMerchantId(merchantId);
        setAccount(account);
        setAmount(amount);
        setPayerRef(payerRef);
        setPaymentmethod(paymentmethod);
        setSha1hash(sha1hash);
        setOrderId(orderId);
        setMpi(mpi);
        setDccInfo(dccInfo);
        setComments(comments);
        setTssinfo(tssinfo);
        setSupplementaryData(supplementaryData);
    }
    
    public RealExRaisingRefundRequest() {
        
    }
    
    public RealExRaisingRefundRequest refundhash(final String value) {
        this.refundhash = value;
        return this;
    }
}
