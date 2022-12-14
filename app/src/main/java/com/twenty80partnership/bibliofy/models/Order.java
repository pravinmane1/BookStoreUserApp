package com.twenty80partnership.bibliofy.models;

import java.io.Serializable;

public class Order  implements Serializable {
    String orderId;
    Address address;
    PriceDetails priceDetails;
    String paymentStatus,orderStatus;
    Long timeAdded;
    Long userTimeAdded;
    String tOid;
    Boolean userViewed;
    Integer daysForDelivery;
    StatusStack statusStack;
    String deliveryPerson;
    String deliveryPersonNumber;

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public String getDeliveryPersonNumber() {
        return deliveryPersonNumber;
    }

    public void setDeliveryPersonNumber(String deliveryPersonNumber) {
        this.deliveryPersonNumber = deliveryPersonNumber;
    }

    public StatusStack getStatusStack() {
        return statusStack;
    }

    public void setStatusStack(StatusStack statusStack) {
        this.statusStack = statusStack;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getDaysForDelivery() {
        return daysForDelivery;
    }

    public void setDaysForDelivery(Integer daysForDelivery) {
        this.daysForDelivery = daysForDelivery;
    }

    public Long getUserTimeAdded() {
        return userTimeAdded;
    }

    public void setUserTimeAdded(Long userTimeAdded) {
        this.userTimeAdded = userTimeAdded;
    }

    public Boolean getUserViewed() {
        return userViewed;
    }

    public void setUserViewed(Boolean userViewed) {
        this.userViewed = userViewed;
    }

    public String gettOid() {
        return tOid;
    }

    public void settOid(String tOid) {
        this.tOid = tOid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Order() {
    }


    public Long getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Long timeAdded) {
        this.timeAdded = timeAdded;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(PriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }



}
