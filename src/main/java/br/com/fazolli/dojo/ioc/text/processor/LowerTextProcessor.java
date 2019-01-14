package br.com.fazolli.dojo.ioc.text.processor;

public class LowerTextProcessor implements TextProcessor {

    public String processText(String text) {
        return text.toLowerCase();
    }

}
