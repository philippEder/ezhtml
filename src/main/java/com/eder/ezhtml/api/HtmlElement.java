package com.eder.ezhtml.api;

import com.eder.ezhtml.attributes.Attribute;
import com.eder.ezhtml.attributes.Attributes;

import java.util.*;

public abstract class HtmlElement<T extends HtmlElement> implements RenderableTag {

    protected String text;
    protected final List<String> styleClasses = new ArrayList<>();
    protected final Map<String, String> attributes = new LinkedHashMap<>();

    public T withAttribute(Attribute attribute) {
        attributes.put(attribute.getName(), attribute.getValue());
        return (T) this;
    }

    public T withAttributes(Attributes attributes) {
        attributes.getAttributes().forEach(this.attributes::put);
        return (T) this;
    }

    public T withAttributes(Attribute... attributes) {

        for (Attribute attribute : attributes) {
            this.attributes.put(attribute.getName(), attribute.getValue());
        }

        return (T) this;
    }

    public T withClass(String styleClass) {
        styleClasses.add(styleClass);
        return (T) this;
    }

    public T withText(String text) {
        this.text = text;
        return (T) this;
    }

    protected String renderOpeningTag() {
        StringBuilder openTagBuilder = new StringBuilder();

        openTagBuilder.append("<");
        openTagBuilder.append(getTag());
        attributes.forEach((attribute, value) -> {
            openTagBuilder.append(" ");
            openTagBuilder.append(attribute);
            openTagBuilder.append("=\"");
            openTagBuilder.append(value);
            openTagBuilder.append("\"");
        });
        openTagBuilder.append(">");
        return openTagBuilder.toString();
    }

    protected String renderClosingTag() {
        return "</" + getTag() + ">";
    }
}
