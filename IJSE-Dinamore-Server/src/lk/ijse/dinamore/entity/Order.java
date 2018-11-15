/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.entity;

/**
 *
 * @author User
 */
public class Order {
    
    private String orderID;
    private String orderDate;
    private String processingTime;
    private String itemCode;
    private int orderQty;
    private double orderAmmount;
    private String customerName;
    private String customerTele;
    private String customerAddress;
    private String teleoperateID;
    private String chefID;
    
    
    public Order() {
    }

    public Order(String orderID, String orderDate, String processingTime, String itemCode, int orderQty, double orderAmmount, String customerName, String customerTele, String customerAddress, String teleoperateID, String chefID) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.processingTime = processingTime;
        this.itemCode = itemCode;
        this.orderQty = orderQty;
        this.orderAmmount = orderAmmount;
        this.customerName = customerName;
        this.customerTele = customerTele;
        this.customerAddress = customerAddress;
        this.teleoperateID = teleoperateID;
        this.chefID = chefID;
    }

   

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the processingTime
     */
    public String getProcessingTime() {
        return processingTime;
    }

    /**
     * @param processingTime the processingTime to set
     */
    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the orderAmmount
     */
    public double getOrderAmmount() {
        return orderAmmount;
    }

    /**
     * @param orderAmmount the orderAmmount to set
     */
    public void setOrderAmmount(double orderAmmount) {
        this.orderAmmount = orderAmmount;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerTele
     */
    public String getCustomerTele() {
        return customerTele;
    }

    /**
     * @param customerTele the customerTele to set
     */
    public void setCustomerTele(String customerTele) {
        this.customerTele = customerTele;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return the teleoperateID
     */
    public String getTeleoperateID() {
        return teleoperateID;
    }

    /**
     * @param teleoperateID the teleoperateID to set
     */
    public void setTeleoperateID(String teleoperateID) {
        this.teleoperateID = teleoperateID;
    }

    /**
     * @return the chefID
     */
    public String getChefID() {
        return chefID;
    }

    /**
     * @param chefID the chefID to set
     */
    public void setChefID(String chefID) {
        this.chefID = chefID;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", processingTime=" + processingTime + ", itemCode=" + itemCode + ", orderQty=" + orderQty + ", orderAmmount=" + orderAmmount + ", customerName=" + customerName + ", customerTele=" + customerTele + ", customerAddress=" + customerAddress + ", teleoperateID=" + teleoperateID + ", chefID=" + chefID + '}';
    }
    
    

    
    
    
}
