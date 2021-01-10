package com.eder.ezhtml.tags.form;

import com.eder.ezhtml.attributes.Attribute;

public class TextInput extends Input<TextInput> {

    public TextInput() {
        withAttribute(new Attribute("type", "text"));
    }

}
