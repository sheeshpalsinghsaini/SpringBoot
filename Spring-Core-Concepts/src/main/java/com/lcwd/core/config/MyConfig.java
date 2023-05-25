package com.lcwd.core.config;

import com.lcwd.core.coupling.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    // declaring the bean using @Bean
    @Bean(name = "samosa1")			// now we can autowired Samosa bean anywhere.
//	@Primary
    public Samosa getSamosa1(){
        return new Samosa("Tandoori Samosa");
    }

    @Bean(name = "samosa2")
//	@Primary
    public Samosa getSamosa2(){
        return new Samosa("Meeta Samosa");
    }
}
