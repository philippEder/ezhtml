package com.eder.ezhtml.api;

import com.eder.ezhtml.attributes.Attribute;
import com.eder.ezhtml.attributes.Attributes;
import com.eder.ezhtml.tags.BodyElement;
import com.eder.ezhtml.tags.HeadElement;
import com.eder.ezhtml.tags.HtmlElement;
import com.eder.ezhtml.tags.block.DivElement;
import com.eder.ezhtml.attributes.StyleClassElement;
import com.eder.ezhtml.tags.form.SubmitInputElement;
import com.eder.ezhtml.tags.form.FormElement;
import com.eder.ezhtml.tags.form.InputElement;
import com.eder.ezhtml.tags.form.TextInputElement;
import com.eder.ezhtml.tags.generics.GenericTextHolderElement;
import com.eder.ezhtml.tags.inline.SpanElement;

public class Statics {

    public static DivElement Div() { return new DivElement(); }

    public static DivElement Div(String text) { return new DivElement().withText(text); }

    public static DivElement Div(String text, Attribute attribute) { return new DivElement().withText(text).withAttribute(attribute); }

    public static DivElement Div(BaseElement<?>... children) { return new DivElement().withChildren(children); }

    public static DivElement Div(Attributes attributes) {return new DivElement().withAttributes(attributes);}

    public static DivElement Div(Attributes attributes, BaseElement<?>... children) {return new DivElement().withAttributes(attributes).withChildren(children);}

    public static DivElement Div(Attribute attribute, BaseElement<?>... children) {return new DivElement().withAttribute(attribute).withChildren(children);}

    public static DivElement Div(Attribute attribute, String text, BaseElement<?>... children) {return new DivElement().withAttribute(attribute).withText(text).withChildren(children);}

    public static Attribute Attribute(String name, String value) {
        return new Attribute(name, value);
    }

    public static Attributes Attributes(String... attributes) {
        return new Attributes(attributes);
    }

    public static SpanElement Span(Attribute attribute, String text) {return new SpanElement().withAttribute(attribute).withText(text);}

    public static SpanElement Span(Attributes attributes, String text) {return new SpanElement().withAttributes(attributes).withText(text);}

    public static SpanElement Span(String text) {return new SpanElement().withText(text);}

    public static HtmlElement Html(Attributes attributes, BaseElement<?>... children) {return new HtmlElement().withAttributes(attributes).withChildren(children);}

    public static HtmlElement Html(Attribute attribute, BaseElement<?>... children) {return new HtmlElement().withAttribute(attribute).withChildren(children);}

    public static HtmlElement Html(BaseElement<?>... children) {return new HtmlElement().withChildren(children);}

    public static HeadElement Head(Attributes attributes, BaseElement<?>... children) {return new HeadElement().withAttributes(attributes).withChildren(children);}

    public static HeadElement Head(Attribute attribute, BaseElement<?>... children) {return new HeadElement().withAttribute(attribute).withChildren(children);}

    public static HeadElement Head(BaseElement<?>... children) {return new HeadElement().withChildren(children);}

    public static BodyElement Body(Attributes attributes, BaseElement<?>... children) {return new BodyElement().withAttributes(attributes).withChildren(children);}

    public static BodyElement Body(Attribute attribute, BaseElement<?>... children) {return new BodyElement().withAttribute(attribute).withChildren(children);}

    public static BodyElement Body(BaseElement<?>... children) {return new BodyElement().withChildren(children);}

    public static GenericTextHolderElement Title(String text) {return new GenericTextHolderElement("title").withText(text);}

    public static GenericTextHolderElement Meta(Attribute attribute) {return new GenericTextHolderElement("meta").withAttribute(attribute);}

    public static FormElement Form(Attribute attribute, BaseElement<?>... children) { return new FormElement().withAttribute(attribute).withChildren(children); }

    public static FormElement Form(Attributes attributes, BaseElement<?>... children) { return new FormElement().withAttributes(attributes).withChildren(children); }

    public static InputElement Input() { return new InputElement<>(); }

    public static InputElement Input(Attribute attribute) { return new InputElement<>().withAttribute(attribute); }

    public static InputElement Input(Attributes attributes) { return new InputElement<>().withAttributes(attributes); }

    public static SubmitInputElement SubmitInput() { return new SubmitInputElement(); }

    public static SubmitInputElement SubmitInput(Attribute attribute) { return new SubmitInputElement().withAttribute(attribute); }

    public static SubmitInputElement SubmitInput(Attributes attributes) { return new SubmitInputElement().withAttributes(attributes); }

    public static TextInputElement TextInput() { return new TextInputElement(); }

    public static TextInputElement TextInput(Attribute attribute) { return new TextInputElement().withAttribute(attribute); }

    public static TextInputElement TextInput(Attributes attributes) { return new TextInputElement().withAttributes(attributes); }

    public static GenericTextHolderElement Label(Attribute attribute) { return new GenericTextHolderElement("label").withAttributes(attribute); }

    public static GenericTextHolderElement Label(Attributes attributes) { return new GenericTextHolderElement("label").withAttributes(attributes); }

    public static GenericTextHolderElement Label(Attribute attribute, String text) { return new GenericTextHolderElement("label").withAttributes(attribute).withText(text); }

    public static GenericTextHolderElement Label(Attributes attributes, String text) { return new GenericTextHolderElement("label").withAttributes(attributes).withText(text); }

}
