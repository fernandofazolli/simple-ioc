package br.com.fazolli.dojo.ioc.responsible;

import br.com.fazolli.dojo.ioc.text.processor.TextProcessor;

import java.util.logging.Logger;

public class TextExecutor {

    private static final Logger LOGGER = Logger.getLogger( TextExecutor.class.getName() );

    private TextProcessor processor;

    public TextExecutor(TextProcessor processor) {
        this.processor = processor;
    }

    public void process(String text) {
        LOGGER.info("Texto a ser Processado ... -> " + text);
        LOGGER.info("Texto já Processado ... -> " + processor.processText(text));
    }

}
