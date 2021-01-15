package com.eder.ezhtml.tags.form;

import com.eder.ezhtml.attributes.Attribute;

public class SubmitInputElement extends InputElement<SubmitInputElement> {

    public SubmitInputElement() {
        withAttribute(new Attribute("type", "submit"));
    }

}
