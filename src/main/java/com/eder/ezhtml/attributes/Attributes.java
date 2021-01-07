package com.eder.ezhtml.attributes;

import java.util.HashMap;
import java.util.Map;

public class Attributes {

    private Map<String, String> attributes = new HashMap<>();

    public Attributes(String... attributes) {

        for (String attribute : attributes) {
            String[] split = attribute.split("=");
            if (split.length != 2) {
                throw new IllegalArgumentException("Invalid attribute Value: " + attribute + " Must match pattern 'attribute=value'");
            }

            this.attributes.put(split[0], split[1]);
        }
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
