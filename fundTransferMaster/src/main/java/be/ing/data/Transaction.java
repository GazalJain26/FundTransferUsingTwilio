package be.ing.data;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.io.Serializable;

@Table("TRANSACTION")
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @PrimaryKey
    private String transactionId;
    private String userId;
    private String senderPhone;
    private String receiverPhone;
    private long senderOtp;
    private long receiverOtp;
    private String senderOtpStatus;
    private String receiverOtpStatus;
    private String transactionStatus;
    private String receiverMailAddress;

    public String getReceiverMailAddress() {
        return receiverMailAddress;
    }

    public void setReceiverMailAddress(String receiverMailAddress) {
        this.receiverMailAddress = receiverMailAddress;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public long getSenderOtp() {
        return senderOtp;
    }

    public void setSenderOtp(long senderOtp) {
        this.senderOtp = senderOtp;
    }

    public long getReceiverOtp() {
        return receiverOtp;
    }

    public void setReceiverOtp(long receiverOtp) {
        this.receiverOtp = receiverOtp;
    }

    public String getSenderOtpStatus() {
        return senderOtpStatus;
    }

    public void setSenderOtpStatus(String senderOtpStatus) {
        this.senderOtpStatus = senderOtpStatus;
    }

    public String getReceiverOtpStatus() {
        return receiverOtpStatus;
    }

    public void setReceiverOtpStatus(String receiverOtpStatus) {
        this.receiverOtpStatus = receiverOtpStatus;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
