package com.eder.ezhtml;

import com.eder.ezhtml.attributes.StyleClassElement;
import com.eder.ezhtml.attributes.StyleClassFile;
import com.eder.ezhtml.tags.HeadElement;
import com.eder.ezhtml.tags.HtmlElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.function.Supplier;


//TODO change to interface???
public class WebPage {

    private HtmlElement html;
    private Set<StyleClassElement> styles;
    //TODO
    private Object javascript;


    public WebPage() {
    }

    public WebPage(HtmlElement html, Set<StyleClassElement> styles, Object javascript) {
        this.html = html;
        this.styles = styles;
        this.javascript = javascript;
    }

    public void generate(String outputDirectory) throws IOException {
        createCssContent(outputDirectory);
        createHtmlContent(outputDirectory);
    }

    private void createHtmlContent(String outputDirectory) throws IOException {
        File htmlFile = new File(outputDirectory+ "/html/index.html");
        createContent(htmlFile, () -> html.render());
    }

    private void createCssContent(String outputDirectory) throws IOException {
        String fileName = "styles.css";
        String fullCssFilePath = outputDirectory + "/css/" + fileName;
        StyleClassFile styleClassFileRepresentation = new StyleClassFile(fullCssFilePath, styles);

        HeadElement head = html.getHead();
        head.includeStyleClassFile(styleClassFileRepresentation);

        File cssFile = new File(fullCssFilePath);
        createContent(cssFile, styleClassFileRepresentation::render);
    }

    private void createContent(File file, Supplier<String> fileContentSupplier) throws IOException {
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileWriter htmlWriter = new FileWriter(file);

        htmlWriter.write(fileContentSupplier.get());
        htmlWriter.flush();
    }


    public HtmlElement getHtml() {
        return html;
    }

    public void setHtml(HtmlElement html) {
        this.html = html;
    }

    public Set<StyleClassElement> getStyles() {
        return styles;
    }

    public void setStyles(Set<StyleClassElement> styles) {
        this.styles = styles;
    }

    public Object getJavascript() {
        return javascript;
    }

    public void setJavascript(Object javascript) {
        this.javascript = javascript;
    }
}
