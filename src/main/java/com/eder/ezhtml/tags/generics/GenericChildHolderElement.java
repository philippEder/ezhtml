package com.eder.ezhtml.tags.generics;

import com.eder.ezhtml.api.ChildHolderElement;

public class GenericChildHolderElement extends ChildHolderElement<GenericChildHolderElement> {

    private final String tag;

    public GenericChildHolderElement(String tag) {
        this.tag = tag;
    }

    @Override
    public String getTag() {
        return tag;
    }
}
