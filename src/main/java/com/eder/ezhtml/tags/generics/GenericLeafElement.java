package com.eder.ezhtml.tags.generics;

import com.eder.ezhtml.api.LeafElement;

public class GenericLeafElement extends LeafElement<GenericLeafElement> {

    private final String tag;

    public GenericLeafElement(String tag) {
        this.tag = tag;
    }

    @Override
    public String getTag() {
        return tag;

    }
}
