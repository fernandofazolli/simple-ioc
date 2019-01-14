package br.com.fazolli.dojo.ioc.spring.injection;

import br.com.fazolli.dojo.ioc.text.processor.TextProcessor;

import java.util.logging.Logger;

public class SpringTextExecutor {

    private static final Logger LOGGER = Logger.getLogger( SpringTextExecutor.class.getName() );

    private TextProcessor processor;

    public SpringTextExecutor(TextProcessor processor) {
        this.processor = processor;
    }

    public void process(String text) {
        LOGGER.info("Texto a ser Processado ... -> " + text);
        LOGGER.info("Texto já Processado ... -> " + processor.processText(text));
    }
}
