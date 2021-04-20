package jk.bigdata.cloudera.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommonConfig {

    @Bean
    public RestTemplate createRestTempalte() {
        return new RestTemplate();
    }

}
