package com.eder.ezhtml.attributes;

public class StyleElement {

    private final String attribute;
    private final String value;

    public StyleElement(String attribute, String value) {
        this.attribute = attribute;
        this.value = value;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getValue() {
        return value;
    }

}
