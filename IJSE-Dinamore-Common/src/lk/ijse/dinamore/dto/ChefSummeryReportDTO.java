/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.dto;

/**
 *
 * @author user
 */
public class ChefSummeryReportDTO extends SuperDTO{
    
    private String name;
    private int orderCount;
    private int orderQTY;
    private String processingTime;

    public ChefSummeryReportDTO() {
    }

    public ChefSummeryReportDTO(String name, int orderCount, int orderQTY, String processingTime) {
        this.name = name;
        this.orderCount = orderCount;
        this.orderQTY = orderQTY;
        this.processingTime = processingTime;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the orderCount
     */
    public int getOrderCount() {
        return orderCount;
    }

    /**
     * @param orderCount the orderCount to set
     */
    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * @return the orderQTY
     */
    public int getOrderQTY() {
        return orderQTY;
    }

    /**
     * @param orderQTY the orderQTY to set
     */
    public void setOrderQTY(int orderQTY) {
        this.orderQTY = orderQTY;
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

    @Override
    public String toString() {
        return "ChefSummeryReportDTO{" + "name=" + name + ", orderCount=" + orderCount + ", orderQTY=" + orderQTY + ", processingTime=" + processingTime + '}';
    }
    
    
    
    
    
}
