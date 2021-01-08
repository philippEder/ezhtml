package com.eder.ezhtml.test;

import org.junit.Assert;
import org.junit.Test;

import static com.eder.ezhtml.api.Statics.*;

public class InlinesTest {

    @Test
    public void basicSpanTest() {
        String actual = "<span>test</span>";

        String expected = Span("test").render();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void styledSpanTest() {
        String actual = "<span stye=\"color:red\">test</span>";

        String expected = Span(Attribute("color", "red"),"test").render();

        Assert.assertEquals(expected, actual);
    }

}
