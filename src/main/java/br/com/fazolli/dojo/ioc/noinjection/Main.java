package br.com.fazolli.dojo.ioc.noinjection;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );

    public static void main(String[] args) {

        LOGGER.info("Iniciando ...");

        TextExecutorNoInjection executor = new TextExecutorNoInjection();
        executor.process(args[0]);

        LOGGER.info("Finalizando ...");

    }

}
