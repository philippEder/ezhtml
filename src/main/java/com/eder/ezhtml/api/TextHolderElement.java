package com.eder.ezhtml.api;

public abstract class TextHolderElement<T extends TextHolderElement<?>> extends BaseElement<T> {

    protected String text;

    public T withText(String text) {
        this.text = text;
        return (T) this;
    }

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
