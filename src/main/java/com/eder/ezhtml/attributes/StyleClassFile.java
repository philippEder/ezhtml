package com.eder.ezhtml.attributes;

import com.eder.ezhtml.api.Renderable;

import java.util.Set;

public class StyleClassFile implements Renderable {

    String path;
    final Set<StyleClassElement> styleClasses;


    public StyleClassFile(Set<StyleClassElement> styleClasses) {
        this.path = path;
        this.styleClasses = styleClasses;
    }

    public StyleClassFile(String path, Set<StyleClassElement> styleClasses) {
        this.path = path;
        this.styleClasses = styleClasses;
    }

    @Override
    public String render() {
        StringBuilder cssFileBuilder = new StringBuilder();
        for (StyleClassElement styleClass : styleClasses) {
            cssFileBuilder.append(styleClass.render());
        }
        return cssFileBuilder.toString();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Set<StyleClassElement> getStyleClasses() {
        return styleClasses;
    }
}
