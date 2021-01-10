package com.eder.ezhtml.tags.form;

import com.eder.ezhtml.attributes.Attribute;

public class SubmitInput extends Input<SubmitInput> {

    public SubmitInput() {
        withAttribute(new Attribute("type", "button"));
    }

}
