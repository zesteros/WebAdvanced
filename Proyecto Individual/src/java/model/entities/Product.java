/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author Angelo
 */
public class Product {

    private String sku;
    private String productName;
    private float buyPrice;
    private String description;
    private float suggestedPrice;
    private float stock;
    private float ordered;
    private String scale;
    private int categoryId;
    private int supplierId;
    private String image;
    private String supplierName;
    private String categoryName;
    private int id;

    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the buyPrice
     */
    public float getBuyPrice() {
        return buyPrice;
    }

    /**
     * @param buyPrice the buyPrice to set
     */
    public void setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
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
     * @return the suggestedPrice
     */
    public float getSuggestedPrice() {
        return suggestedPrice;
    }

    /**
     * @param suggestedPrice the suggestedPrice to set
     */
    public void setSuggestedPrice(float suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    /**
     * @return the stock
     */
    public float getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(float stock) {
        this.stock = stock;
    }

    /**
     * @return the ordered
     */
    public float getOrdered() {
        return ordered;
    }

    /**
     * @param ordered the ordered to set
     */
    public void setOrdered(float ordered) {
        this.ordered = ordered;
    }

    /**
     * @return the scale
     */
    public String getScale() {
        return scale;
    }

    /**
     * @param scale the scale to set
     */
    public void setScale(String scale) {
        this.scale = scale;
    }

    /**
     * @return the categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setProductID(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getProductID() {
        return id;
    }
}
