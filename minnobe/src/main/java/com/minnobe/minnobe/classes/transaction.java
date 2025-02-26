package com.minnobe.minnobe.classes;

//Elaborate on this 
public class Transaction {
    //Apple pay generates a unique transaction ID, CC info is never stored
    String renterId;
    String owenerId;
    String deliveryDriverId;
    String itemId;
    String transactionId;
    
    public String getRenterId() {
        return renterId;
    }
    public void setRenterId(String renterId) {
        this.renterId = renterId;
    }
    public String getOwenerId() {
        return owenerId;
    }
    public void setOwenerId(String owenerId) {
        this.owenerId = owenerId;
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

    public Transaction(String renterId, String owenerId, String deliveryDriverId, String itemId, String transactionId) {
        this.renterId = renterId;
        this.owenerId = owenerId;
        this.deliveryDriverId = deliveryDriverId;
        this.itemId = itemId;
        this.transactionId = transactionId;
    }

    

    

}
