package com.soyeb.flutter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class FlutterApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(FlutterApplication.class, args);
	}
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/uploads/**").addResourceLocations("file:uploads/");
	    }

}
