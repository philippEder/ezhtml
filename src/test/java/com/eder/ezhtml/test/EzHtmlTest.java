package com.eder.ezhtml.test;

import org.junit.Assert;
import org.junit.Test;

import static com.eder.ezhtml.api.Statics.*;

public class EzHtmlTest {

    @Test
    public void basicTest() {
        String expected = "<!DOCTYPE html>" + "" +
                            "<html lang=\"en-US\" style=\"height: 100%\">" +
                                "<head><title>Test Title</title><meta charset=\"utf-8\"></meta></head>" +
                                "<body><div>test</div></body>" +
                            "</html>";

        String actual =

        Html(Attributes("lang=en-US", "style=height: 100%"),
          Head(
             Title("Test Title"),
             Meta(Attribute("charset", "utf-8"))
          ),
          Body(
              Div("test")
          )
        )

        .render();

        Assert.assertEquals(expected, actual);
    }

}
