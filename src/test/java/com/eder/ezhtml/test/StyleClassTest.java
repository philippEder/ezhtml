package com.eder.ezhtml.test;

import org.junit.Assert;
import org.junit.Test;

import static com.eder.ezhtml.api.CssStatics.Style;
import static com.eder.ezhtml.api.CssStatics.StyleClass;

public class StyleClassTest {

    @Test
    public void styleClassTest() {
        String expected = "test{color:red;float:left;}";

        String actual =
        StyleClass("test",
                   Style("color", "red"),
                   Style("float", "left")
                  )
        .render();

        Assert.assertEquals(expected, actual);
    }
}
