package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<h1>Welcome!</h1>" +
                "<p>Type yes if u wanna suck my dick bitch: " +
                  "<form><input type=\"text\" name=\"q\" />" +
                    "<input type=\"submit\">" +
                  "</form>" +
                "</p>");
    }
    
}
