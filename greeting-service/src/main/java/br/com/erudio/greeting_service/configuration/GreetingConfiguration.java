package br.com.erudio.greeting_service.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@RefreshScope
@ConfigurationProperties("greeting-service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GreetingConfiguration {
    
    private String greeting;
    private String defaultValue;
}
