package br.com.fazolli.dojo.ioc.noinjection;

import br.com.fazolli.dojo.ioc.text.processor.UpperTextProcessor;

import java.util.logging.Logger;

public class TextExecutorNoInjection {

    private static final Logger LOGGER = Logger.getLogger( TextExecutorNoInjection.class.getName() );

    public void process(String text) {

        LOGGER.info("Texto a ser Processado ... -> " + text);

        UpperTextProcessor processor = new UpperTextProcessor();

        LOGGER.info("Texto já Processado ... -> " + processor.processText(text));
    }

}
