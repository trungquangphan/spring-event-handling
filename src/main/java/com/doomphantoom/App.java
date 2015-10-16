package com.doomphantoom;

import com.doomphantoom.listener.OrderEventListener;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * Hello world!
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.doomphantoom")
public class App {
}
