package com.lookcar.xsyz.ntfirst.entity;

/**
 * @author kongmingliang
 * @date 2020-11-24 17:18
 **/
public class FtProduct {

    /**
     * 主键ID
     */
    private int id;
    /**
     * 1:发动机油; 2:刹车油; 3:变速箱油;
     */
    private String productType;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品图片url
     */
    private String productPhoto;
    /**
     * 产品容量
     */
    private String productCapacity;
    /**
     * 产品认证
     */
    private String productAuthentication;
    /**
     * 产品描述
     */
    private String productDescription;
    /**
     * 产品特性
     */
    private String productFeatures;
    /**
     * 质量认证及规格
     */
    private String productISO;
    /**
     * 产品上线时间
     */
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }

    public String getProductCapacity() {
        return productCapacity;
    }

    public void setProductCapacity(String productCapacity) {
        this.productCapacity = productCapacity;
    }

    public String getProductAuthentication() {
        return productAuthentication;
    }

    public void setProductAuthentication(String productAuthentication) {
        this.productAuthentication = productAuthentication;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductFeatures() {
        return productFeatures;
    }

    public void setProductFeatures(String productFeatures) {
        this.productFeatures = productFeatures;
    }

    public String getProductISO() {
        return productISO;
    }

    public void setProductISO(String productISO) {
        this.productISO = productISO;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
