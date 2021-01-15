package com.eder.ezhtml.attributes;

import com.eder.ezhtml.api.Renderable;

import java.util.HashSet;
import java.util.Set;

public class StyleClassElement implements Renderable {

    final String selector;
    Set<StyleElement> styles = new HashSet<>();

    public StyleClassElement(String selector) {
        this.selector = selector;
    }

    public StyleClassElement(String selector, Set<StyleElement> styles) {
        this.selector = selector;
        this.styles = styles;
    }



    public void addStyle(String attribute, String value) {
        styles.add(new StyleElement(attribute, value));
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public String render() {
        StringBuilder styleClassBuilder = new StringBuilder();

        styleClassBuilder.append(selector);
        styleClassBuilder.append("{");
        styles.forEach(style -> {
            styleClassBuilder.append(style.getAttribute());
            styleClassBuilder.append(":");
            styleClassBuilder.append(style.getValue());
            styleClassBuilder.append(";");
        });

        styleClassBuilder.append("}");
        return styleClassBuilder.toString();
    }
}
