package com.eder.ezhtml.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class ChildHolderElement<T extends ChildHolderElement<?>> extends TextHolderElement<T> {

    private final List<HtmlElement<?>> children = new ArrayList<>();

    public T withChild(HtmlElement<?> child) {
        validateChild(child);
        children.add(child);
        return (T) this;
    }

    public T withChildren(HtmlElement<?>... children) {
        for (HtmlElement<?> child : children) {
            validateChild(child);
            this.children.add(child);
        }
        return (T) this;
    }

    private void validateChild(HtmlElement<?> child) {
        if (getRestrictedChildren() != null &&
            !getRestrictedChildren().isEmpty() &&
            !getRestrictedChildren().contains(child.getTag())) {
            throw new IllegalArgumentException("Child '" + child.getTag() +"' not allowed for parent '" + this.getTag() + "'");
        }
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

    protected Set<String> getRestrictedChildren() {
        return null;
    }

}
