package com.eder.ezhtml.tags;

import com.eder.ezhtml.api.ChildHolderElement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Html extends ChildHolderElement<Html> {
    @Override
    public String getTag() {
        return "html";
    }

    @Override
    public String render() {
        return "<!DOCTYPE html>" + super.render();
    }

    @Override
    protected Set<String> getRestrictedChildren() {
        return new HashSet<>(Arrays.asList("body", "head"));
    }
}
