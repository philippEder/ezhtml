package com.eder.ezhtml.api;

public abstract class LeafElement<T extends LeafElement<?>> extends HtmlElement<T> {

    @Override
    public String render() {
        return renderOpeningTag() + renderClosingTag();
    }

}
