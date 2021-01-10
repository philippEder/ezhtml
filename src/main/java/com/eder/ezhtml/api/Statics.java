package com.eder.ezhtml.api;

import com.eder.ezhtml.attributes.Attribute;
import com.eder.ezhtml.attributes.Attributes;
import com.eder.ezhtml.tags.Body;
import com.eder.ezhtml.tags.Head;
import com.eder.ezhtml.tags.Html;
import com.eder.ezhtml.tags.block.Div;
import com.eder.ezhtml.attributes.StyleClass;
import com.eder.ezhtml.tags.form.SubmitInput;
import com.eder.ezhtml.tags.form.Form;
import com.eder.ezhtml.tags.form.Input;
import com.eder.ezhtml.tags.form.TextInput;
import com.eder.ezhtml.tags.generics.GenericTextHolderElement;
import com.eder.ezhtml.tags.inline.Span;

public class Statics {

    public static Div Div() { return new Div(); }

    public static Div Div(String text) { return new Div().withText(text); }

    public static Div Div(HtmlElement<?>... children) { return new Div().withChildren(children); }

    public static Div Div(Attributes attributes) {return new Div().withAttributes(attributes);}

    public static Div Div(Attributes attributes, HtmlElement<?>... children) {return new Div().withAttributes(attributes).withChildren(children);}

    public static Div Div(Attribute attribute, HtmlElement<?>... children) {return new Div().withAttribute(attribute).withChildren(children);}

    public static Div Div(Attribute attribute, String text, HtmlElement<?>... children) {return new Div().withAttribute(attribute).withText(text).withChildren(children);}

    public static StyleClass StyleClass(String className) {
        return new StyleClass(className);
    }

    public static Attribute Attribute(String name, String value) {
        return new Attribute(name, value);
    }

    public static Attributes Attributes(String... attributes) {
        return new Attributes(attributes);
    }

    public static Span Span(Attribute attribute, String text) {return new Span().withAttribute(attribute).withText(text);}

    public static Span Span(Attributes attributes, String text) {return new Span().withAttributes(attributes).withText(text);}

    public static Span Span(String text) {return new Span().withText(text);}

    public static Html Html(Attributes attributes, HtmlElement<?>... children) {return new Html().withAttributes(attributes).withChildren(children);}

    public static Html Html(Attribute attribute, HtmlElement<?>... children) {return new Html().withAttribute(attribute).withChildren(children);}

    public static Html Html(HtmlElement<?>... children) {return new Html().withChildren(children);}

    public static Head Head(Attributes attributes, HtmlElement<?>... children) {return new Head().withAttributes(attributes).withChildren(children);}

    public static Head Head(Attribute attribute, HtmlElement<?>... children) {return new Head().withAttribute(attribute).withChildren(children);}

    public static Head Head(HtmlElement<?>... children) {return new Head().withChildren(children);}

    public static Body Body(Attributes attributes, HtmlElement<?>... children) {return new Body().withAttributes(attributes).withChildren(children);}

    public static Body Body(Attribute attribute, HtmlElement<?>... children) {return new Body().withAttribute(attribute).withChildren(children);}

    public static Body Body(HtmlElement<?>... children) {return new Body().withChildren(children);}

    public static GenericTextHolderElement Title(String text) {return new GenericTextHolderElement("title").withText(text);}

    public static GenericTextHolderElement Meta(Attribute attribute) {return new GenericTextHolderElement("meta").withAttribute(attribute);}

    public static Form Form(Attribute attribute, HtmlElement<?>... children) { return new Form().withAttribute(attribute).withChildren(children); }

    public static Form Form(Attributes attributes, HtmlElement<?>... children) { return new Form().withAttributes(attributes).withChildren(children); }

    public static Input Input() { return new Input<>(); }

    public static Input Input(Attribute attribute) { return new Input<>().withAttribute(attribute); }

    public static Input Input(Attributes attributes) { return new Input<>().withAttributes(attributes); }

    public static SubmitInput SubmitInput() { return new SubmitInput(); }

    public static SubmitInput SubmitInput(Attribute attribute) { return new SubmitInput().withAttribute(attribute); }

    public static SubmitInput SubmitInput(Attributes attributes) { return new SubmitInput().withAttributes(attributes); }

    public static TextInput TextInput() { return new TextInput(); }

    public static TextInput TextInput(Attribute attribute) { return new TextInput().withAttribute(attribute); }

    public static TextInput TextInput(Attributes attributes) { return new TextInput().withAttributes(attributes); }

    public static GenericTextHolderElement Label(Attribute attribute) { return new GenericTextHolderElement("label").withAttributes(attribute); }

    public static GenericTextHolderElement Label(Attributes attributes) { return new GenericTextHolderElement("label").withAttributes(attributes); }

    public static GenericTextHolderElement Label(Attribute attribute, String text) { return new GenericTextHolderElement("label").withAttributes(attribute).withText(text); }

    public static GenericTextHolderElement Label(Attributes attributes, String text) { return new GenericTextHolderElement("label").withAttributes(attributes).withText(text); }

}
