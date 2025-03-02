package com.minnobe.minnobe.classes;

import jakarta.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction {
    //Apple pay generates a unique transaction ID, CC info is never stored
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String transactionId;
   
    @Column(name="renterId")
    String renterId;

    @Column(name="ownerId")
    String ownerId;

    @Column(name="deliveryDriverId")
    String deliveryDriverId;

    @Column(name="itemId")
    String itemId;

    @Column(name="paymentId")
    String paymentId;

    public Transaction(String renterId, String ownerId, String deliveryDriverId, String itemId, String transactionId,
            String paymentId) {
        this.renterId = renterId;
        this.ownerId = ownerId;
        this.deliveryDriverId = deliveryDriverId;
        this.itemId = itemId;
        this.transactionId = transactionId;
        this.paymentId = paymentId;
    }
    
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getRenterId() {
        return renterId;
    }
    public void setRenterId(String renterId) {
        this.renterId = renterId;
    }
    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    public String getDeliveryDriverId() {
        return deliveryDriverId;
    }
    public void setDeliveryDriverId(String deliveryDriverId) {
        this.deliveryDriverId = deliveryDriverId;
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", renterId=" + renterId + ", ownerId=" + ownerId
                + ", deliveryDriverId=" + deliveryDriverId + ", itemId=" + itemId + ", paymentId=" + paymentId + "]";
    }


}
