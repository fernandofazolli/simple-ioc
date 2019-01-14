package br.com.fazolli.dojo.ioc.responsible;

import br.com.fazolli.dojo.ioc.text.processor.LowerTextProcessor;
import br.com.fazolli.dojo.ioc.text.processor.ReverseTextProcessor;
import br.com.fazolli.dojo.ioc.text.processor.TextProcessor;
import br.com.fazolli.dojo.ioc.text.processor.UpperTextProcessor;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );

    public static void main(String[] args) {
        LOGGER.info("Iniciando ...");

        TextProcessor reverseTextProcessor = new ReverseTextProcessor();
        TextProcessor upperTextProcessor = new UpperTextProcessor();
        TextProcessor lowerTextProcessor = new LowerTextProcessor();

        TextExecutor executor = new TextExecutor(reverseTextProcessor);

        executor.process(args[0]);

        LOGGER.info("Finalizando ...");
    }

}
