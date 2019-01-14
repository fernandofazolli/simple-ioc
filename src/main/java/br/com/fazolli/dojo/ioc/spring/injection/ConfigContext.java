package br.com.fazolli.dojo.ioc.spring.injection;

import br.com.fazolli.dojo.ioc.text.processor.LowerTextProcessor;
import br.com.fazolli.dojo.ioc.text.processor.ReverseTextProcessor;
import br.com.fazolli.dojo.ioc.text.processor.TextProcessor;
import br.com.fazolli.dojo.ioc.text.processor.UpperTextProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigContext {

    @Bean("lower")
    public TextProcessor getLowerProcessor(){
        return  new LowerTextProcessor();
    }

    @Bean("upper")
    public TextProcessor getUpperProcessor(){
        return  new UpperTextProcessor();
    }

    @Bean("reverse")
    @Primary
    public TextProcessor getReverseProcessor(){
        return  new ReverseTextProcessor();
    }

    @Bean
    public SpringTextExecutor getTextExecutor(@Qualifier("upper") TextProcessor processor) {
        return new SpringTextExecutor(processor);
    }

}
