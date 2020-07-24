package com.vmware.gpssconsolle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Daniele Palaia
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Application Service REST API")
                .description("Expose REST API to query the Entity Types in the Gemfire Cache")
                .termsOfServiceUrl("")
                .version("1")
                .contact(new Contact("Vmware", "https://github.com/DanielePalaia/gpss-console", "dpalaia@vmware.com"))
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()

                .apis( RequestHandlerSelectors.basePackage( "com.vmware.gpssconsolle" ) )
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");



    }
}
