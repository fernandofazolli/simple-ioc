package br.com.fazolli.dojo.ioc.text.processor;

public class UpperTextProcessor implements TextProcessor {

    public String processText(String text) {
        return text.toUpperCase();
    }

}
