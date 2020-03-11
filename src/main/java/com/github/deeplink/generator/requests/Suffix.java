package com.github.deeplink.generator.requests;

public class Suffix {
    private String option;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "{" +
                "option='" + option + '\'' +
                '}';
    }
}
