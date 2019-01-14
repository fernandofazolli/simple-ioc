package br.com.fazolli.dojo.ioc.text.processor;

public class ReverseTextProcessor implements TextProcessor{

    public String processText(String text) {
        return new StringBuffer(text).reverse().toString();
    }

}
