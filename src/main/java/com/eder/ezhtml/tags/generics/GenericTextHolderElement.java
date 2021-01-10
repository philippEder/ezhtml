package com.eder.ezhtml.tags.generics;

import com.eder.ezhtml.api.TextHolderElement;

public class GenericTextHolderElement extends TextHolderElement<GenericTextHolderElement> {

    private final String tag;

    public GenericTextHolderElement(String tag) {
        this.tag = tag;
    }

    @Override
    public String getTag() {
        return tag;
    }
}
