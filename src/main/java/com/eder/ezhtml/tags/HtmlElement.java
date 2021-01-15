package com.eder.ezhtml.tags;

import com.eder.ezhtml.api.BaseElement;
import com.eder.ezhtml.api.ChildHolderElement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HtmlElement extends ChildHolderElement<HtmlElement> {
    @Override
    public String getTag() {
        return "html";
    }

    @Override
    public String render() {
        return "<!DOCTYPE html>" + super.render();
    }

    @Override
    protected Set<String> getRestrictedChildren() {
        return new HashSet<>(Arrays.asList("body", "head"));
    }

    public HeadElement getHead() {
        for (BaseElement<?> child : getChildren()) {
            if (child instanceof HeadElement) {
                return (HeadElement )child;
            }
        }

        return null;
    }

}
