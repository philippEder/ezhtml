package com.eder.ezhtml.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class ChildHolderElement<T extends ChildHolderElement> extends HtmlElement<T> {

    private final List<HtmlElement> children = new ArrayList<>();

    public T withChild(HtmlElement child) {
        children.add(child);
        return (T) this;
    }

    public T withChildren(HtmlElement... children) {
        this.children.addAll(Stream.of(children).collect(Collectors.toList()));
        return (T) this;
    }

    @Override
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

}
