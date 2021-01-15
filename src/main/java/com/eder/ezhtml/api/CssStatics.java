package com.eder.ezhtml.api;

import com.eder.ezhtml.attributes.StyleClassFile;
import com.eder.ezhtml.attributes.StyleElement;
import com.eder.ezhtml.attributes.StyleClassElement;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CssStatics {

    public static StyleClassFile StyleClassFile(StyleClassElement... classes) {
        return new StyleClassFile(Stream.of(classes).collect(Collectors.toSet()));
    }

    public static StyleClassElement StyleClass(String selector, StyleElement... styles) {
        return new StyleClassElement(selector, Stream.of(styles).collect(Collectors.toSet()));
    }

    public static StyleElement Style(String attribute, String value) {
        return new StyleElement(attribute, value);
    }

}
