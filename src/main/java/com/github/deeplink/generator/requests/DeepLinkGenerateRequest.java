package com.github.deeplink.generator.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeepLinkGenerateRequest {
    @JsonProperty("dynamicLinkInfo")
    private DynamicLink dynamicLink;
    private Suffix suffix;

    public DynamicLink getDynamicLink() {
        return dynamicLink;
    }

    public void setDynamicLink(DynamicLink dynamicLink) {
        this.dynamicLink = dynamicLink;
    }

    public Suffix getSuffix() {
        return suffix;
    }

    public void setSuffix(Suffix suffix) {
        this.suffix = suffix;
    }
}