package com.eder.ezhtml.tags.inline;

import com.eder.ezhtml.api.LeafElement;

public class GenericInlineElement extends LeafElement<GenericInlineElement> {

    private String tag;

    public GenericInlineElement(String tag) {
        this.tag = tag;
    }

    @Override
    public String getTag() {
        return tag;
    }
}
