package com.eder.ezhtml.api;

public abstract class LeafElement<T extends LeafElement> extends HtmlElement<T> {

    @Override
    public String render() {
        StringBuilder htmlBuilder = new StringBuilder();

        htmlBuilder.append(renderOpeningTag());
        if (text != null) {
            htmlBuilder.append(text);
        }
        htmlBuilder.append(renderClosingTag());

        return htmlBuilder.toString();
    }

}
