package com.github.deeplink.generator.requests;

public class DynamicLink {
    private String domainUriPrefix;
    private String link;

    public String getDomainUriPrefix() {
        return domainUriPrefix;
    }

    public void setDomainUriPrefix(String domainUriPrefix) {
        this.domainUriPrefix = domainUriPrefix;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
