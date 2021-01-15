package com.eder.ezhtml.tags.form;

import com.eder.ezhtml.attributes.Attribute;

public class TextInputElement extends InputElement<TextInputElement> {

    public TextInputElement() {
        withAttribute(new Attribute("type", "text"));
    }

}
