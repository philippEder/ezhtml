package com.eder.ezhtml.test;

import org.junit.Test;

;import static com.eder.ezhtml.api.Statics.*;

public class FormTest {

    @Test
    public void basicTest() {
        String expected = "<form action=\"/action_page.php\">" +
                "  <label for=\"fname\">First name:</label>" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\"></input>" +
                "  <label for=\"lname\">Last name:</label>" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\"></input>" +
                "  <input type=\"submit\" value=\"Submit\"></input>" +
                "</form>";

        String actual =

        Form(Attribute("action", "/action_page.php"),
             Label(Attribute("for", "fname"), "First name:"),
             TextInput(Attributes("id=fname", "name=fname")),
             Label(Attribute("for", "lname"), "Last name:"),
             TextInput(Attributes("id=lname", "name=lname")),
             SubmitInput(Attribute("value", "Submit"))
        )

        .render();

    }

}
