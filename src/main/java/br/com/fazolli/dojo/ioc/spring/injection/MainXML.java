package br.com.fazolli.dojo.ioc.spring.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class MainXML {
    private static final Logger LOGGER = Logger.getLogger( MainXML.class.getName() );

    public static void main(String[] args) {
        LOGGER.info("Iniciando ...");

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

        SpringTextExecutor executor = context.getBean(SpringTextExecutor.class);

        executor.process(args[0]);

        LOGGER.info("Finalizando ...");
    }

}
