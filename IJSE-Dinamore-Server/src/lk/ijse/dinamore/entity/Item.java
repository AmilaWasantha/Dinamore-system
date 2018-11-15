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
public class Item {
    
    private String itemCode;
    private String description;
    private double unitPrice;

    public Item() {
    }

    public Item(String itemCode, String description, double unitPrice) {
        this.itemCode = itemCode;
        this.description = description;
        this.unitPrice = unitPrice;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "itemCode=" + itemCode + ", description=" + description + ", unitPrice=" + unitPrice + '}';
    }
    
    
}
