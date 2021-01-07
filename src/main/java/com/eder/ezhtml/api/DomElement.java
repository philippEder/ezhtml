package com.eder.ezhtml.api;

import com.eder.ezhtml.attributes.Attribute;
import com.eder.ezhtml.attributes.Attributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class DomElement<T extends DomElement> implements RenderableTag {

    private String text;
    private final List<DomElement> children = new ArrayList<>();

    private final List<String> styleClasses = new ArrayList<>();
    private final Map<String, String> attributes = new HashMap<>();

    public T withChild(DomElement child) {
        children.add(child);
        return (T) this;
    }

    public T withChildren(DomElement... children) {
        this.children.addAll(Stream.of(children).collect(Collectors.toList()));
        return (T) this;
    }

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

    public abstract String getTag();

    public String render() {
        StringBuilder htmlBuilder = new StringBuilder();

        htmlBuilder.append(renderOpeningTag());
        if (text != null) {
            htmlBuilder.append(text);
        }
        children.forEach(element -> htmlBuilder.append(element.render()));
        htmlBuilder.append(renderClosingTag());

        return htmlBuilder.toString();
    }

    private String renderOpeningTag() {
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

    private String renderClosingTag() {
        return "</" + getTag() + ">";
    }


}
