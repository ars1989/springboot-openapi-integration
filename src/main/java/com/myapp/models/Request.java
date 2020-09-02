package com.myapp.models;

public class Request {

    ProductSample productSample;

    int apiSecuredKey;

    public Request() {
    }

    public ProductSample getProductSample() {
        return productSample;
    }

    public void setProductSample(ProductSample productSample) {
        this.productSample = productSample;
    }

    public int getApiSecuredKey() {
        return apiSecuredKey;
    }

    public void setApiSecuredKey(int apiSecuredKey) {
        this.apiSecuredKey = apiSecuredKey;
    }
}
