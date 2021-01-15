package com.eder.ezhtml.test;

import com.eder.ezhtml.WebPage;
import com.eder.ezhtml.attributes.Attribute;
import com.eder.ezhtml.attributes.StyleClassElement;
import com.eder.ezhtml.tags.HtmlElement;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

import static com.eder.ezhtml.api.Statics.*;
import static com.eder.ezhtml.api.CssStatics.*;

public class WebPageTest {

    @Test
    public void webPageTest() throws IOException {

        WebPage page = new WebPage();

        HtmlElement html =
        Html(
          Head(
            Title("styledPage")
          ),
          Body(
            Div("blue text", Attribute("class", "testClass")),
            Span("red text")
          )
        );


        StyleClassElement allSpansStyle =
        StyleClass("span",
                    Style("color", "red")
                  );

        StyleClassElement testClass =
                StyleClass(".testClass",
                        Style("color", "blue")
                );

        page.setHtml(html);
        page.setStyles(new HashSet<>(Arrays.asList(allSpansStyle, testClass)));

        page.generate("C:/Users/peder/Desktop/ezHtml");
    }

}
