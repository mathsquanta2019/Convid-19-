package com.safemtech.convid19tracker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
@EnableWebMvc
public class Convid19Config extends WebMvcConfigurationSupport {
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler( "/webjars/**","/img/**")
	            .addResourceLocations("classpath:/META-INF/resources/webjars/",
                        "classpath:/static/img/");
	}

}
