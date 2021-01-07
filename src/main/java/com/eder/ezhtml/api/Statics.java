package com.eder.ezhtml.api;

import com.eder.ezhtml.attributes.Attribute;
import com.eder.ezhtml.attributes.Attributes;
import com.eder.ezhtml.tags.Div;
import com.eder.ezhtml.attributes.StyleClass;

public class Statics {

    public static Div Div() { return new Div(); }

    public static Div Div(String text) { return new Div().withText(text); }

    public static Div Div(DomElement... children) { return new Div().withChildren(children); }

    public static Div Div(Attributes attributes) {return new Div().withAttributes(attributes);}

    public static Div Div(Attributes attributes, DomElement... children) {return new Div().withAttributes(attributes).withChildren(children);}

    public static Div Div(Attribute attribute, DomElement... children) {return new Div().withAttribute(attribute).withChildren(children);}

    public static Div Div(Attribute attribute, String text, DomElement... children) {return new Div().withAttribute(attribute).withText(text).withChildren(children);}

    public static StyleClass StyleClass(String className) {
        return new StyleClass(className);
    }

    public static Attribute Attribute(String name, String value) {
        return new Attribute(name, value);
    }

    public static Attributes Attributes(String... attributes) {
        return new Attributes(attributes);
    }



}
