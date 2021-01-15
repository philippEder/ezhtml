package com.eder.ezhtml.tags;

import com.eder.ezhtml.api.ChildHolderElement;
import com.eder.ezhtml.attributes.Attribute;
import com.eder.ezhtml.attributes.StyleClassFile;
import com.eder.ezhtml.tags.generics.GenericLeafElement;

public class HeadElement extends ChildHolderElement<HeadElement> {
    @Override
    public String getTag() {
        return "head";
    }


    public void includeStyleClassFile(StyleClassFile styleClass) {
        GenericLeafElement linkelement = new GenericLeafElement("link")
                .withAttribute(new Attribute("rel", "stylesheet"))
                .withAttribute(new Attribute("href", styleClass.getPath()));
        getChildren().add(linkelement);
    }

    public void includeScript() {

    }

}
