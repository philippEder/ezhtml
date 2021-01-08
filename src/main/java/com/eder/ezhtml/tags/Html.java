package com.eder.ezhtml.tags;

import com.eder.ezhtml.api.ChildHolderElement;

public class Html extends ChildHolderElement<Html> {
    @Override
    public String getTag() {
        return "html";
    }

    @Override
    public String render() {
        return "<!DOCTYPE html>" + super.render();
    }
}
