package com.example.ParcticaMetaenlace_1.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Configuration;



import java.util.Collections;


@Configuration
@OpenAPIDefinition

public class SwaggerConfiguracion {

    public OpenAPI api(){
        return  new OpenAPI();
    }

}
