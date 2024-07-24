package com.tati.classes_platform.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Api to manage virtual classes platform", version = "1.0", description = "EndPoints documentation of classes platform application"))
public class OpenApiConfiguration {

}
