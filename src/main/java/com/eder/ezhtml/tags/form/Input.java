package com.eder.ezhtml.tags.form;

import com.eder.ezhtml.api.LeafElement;
import com.eder.ezhtml.attributes.Attribute;

public class Input<T extends Input<?>> extends LeafElement<T> {

    public Input() {
        withAttribute(new Attribute("type", "text"));
    }

    @Override
    public String getTag() {
        return "input";
    }
}
