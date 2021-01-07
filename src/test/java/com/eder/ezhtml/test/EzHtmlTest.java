package com.eder.ezhtml.test;

import org.junit.Assert;
import org.junit.Test;

import static com.eder.ezhtml.api.Statics.*;

public class EzHtmlTest {

    @Test
    public void BasicDivTextTest() {
        String expected = "<div>text</div>";

        String actual = Div("text").render();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NestedDivsTest() {
        String expected = "<div><div>text1</div><div>text2</div></div>";

        String actual =
        Div(
            Div("text1"),
            Div("text2")
        ).render();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AttributedDivTest() {
        String expected = "<div lang=\"en\"></div>";

        String actual =
            Div(Attribute("lang","en")).render();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MultipleAttributedDivTest() {
        String expected = "<div lang=\"en\" class=\"testStyle\"></div>";

        String actual =
                Div(Attributes("lang=en","class=testStyle")).render();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void MultipleAttributedDivInvalidPatternTest() {
        Div(Attributes("langen","class==testStyle"));
    }

    @Test
    public void funTest() {
        String expected = "<div id=\"fun\"><div style=\"color:red; border: 1px solid black\">red<div><div>child1</div><div>child2</div></div></div></div>";
        String actual =
        Div(Attribute("id", "fun"),
            Div(Attribute("style", "color:red; border: 1px solid black"),
                "red",
                Div(
                    Div("child1"),
                    Div("child2")
                )
            )
        ).render();

        Assert.assertEquals(expected, actual);
    }

}