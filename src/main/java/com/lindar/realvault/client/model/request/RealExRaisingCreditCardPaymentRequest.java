package com.lindar.realvault.client.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import com.lindar.realvault.client.model.internal.RealExAmount;
import com.lindar.realvault.client.model.internal.RealExAutoSettle;
import com.lindar.realvault.client.model.internal.RealExComments;
import com.lindar.realvault.client.model.internal.RealExDCCInfo;
import com.lindar.realvault.client.model.internal.RealExMPI;
import com.lindar.realvault.client.model.internal.RealExPaymentData;
import com.lindar.realvault.client.model.internal.RealExSupplementaryData;
import com.lindar.realvault.client.model.internal.RealExTSSInfo;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
public class RealExRaisingCreditCardPaymentRequest extends RealExPaymentRequest {

    private static final long serialVersionUID = 1304033126562317761L;

    private static final String TYPE = "receipt-in";

    @Getter
    @XmlElement
    private RealExPaymentData paymentData;

    @Getter
    @XmlElement(required = true)
    private RealExAutoSettle autoSettle;

    public RealExRaisingCreditCardPaymentRequest(String timestamp, String merchantId, String account, RealExAmount amount, String payerRef, String paymentmethod,
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
    
    public RealExRaisingCreditCardPaymentRequest() {}

    public RealExRaisingCreditCardPaymentRequest autoSettle(final RealExAutoSettle value) {
        this.autoSettle = value;
        return this;
    }

    public RealExRaisingCreditCardPaymentRequest paymentData(final RealExPaymentData value) {
        this.paymentData = value;
        return this;
    }
}
