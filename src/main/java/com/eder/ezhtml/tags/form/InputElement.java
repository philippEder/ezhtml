package com.eder.ezhtml.tags.form;

import com.eder.ezhtml.api.LeafElement;
import com.eder.ezhtml.attributes.Attribute;

public class InputElement<T extends InputElement<?>> extends LeafElement<T> {

    public InputElement() {
        withAttribute(new Attribute("type", "text"));
    }

    @Override
    public String getTag() {
        return "input";
    }
}
