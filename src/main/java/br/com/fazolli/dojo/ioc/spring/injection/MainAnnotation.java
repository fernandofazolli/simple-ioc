package br.com.fazolli.dojo.ioc.spring.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class MainAnnotation {
    private static final Logger LOGGER = Logger.getLogger( MainAnnotation.class.getName() );

    public static void main(String[] args) {
        LOGGER.info("Iniciando ...");

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ConfigContext.class);

        SpringTextExecutor executor = context.getBean(SpringTextExecutor.class);

        executor.process(args[0]);

        LOGGER.info("Finalizando ...");
    }

}

