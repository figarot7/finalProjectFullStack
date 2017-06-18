package com.dh.project.finaltest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by skypper on 17-06-17.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dh.project.finaltest.web"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);

    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Api Rest  Sistema de administración de estudiantes",
                "Este sistema tiene la finalidad de proveer las herramientas necesarias para el manejo de información de estudiantes, docentes, materias y tareas. Los cuales deben ser representados en una base de datos, donde los usuarios puedan efectuar diferentes consultas y operaciones sobre la misma, a su vez se debe representar dicha información en una interfaz de usuario acorde a los estándares actuales.",
                "1.0",
                "urn:tos",
                ApiInfo.DEFAULT_CONTACT,
                "Apache 2.0",
                "http");
    }
}
