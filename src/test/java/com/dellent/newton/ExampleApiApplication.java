package com.dellent.newton;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
	    tags = {
	            @Tag(name="/q/swagger-ui", description="Calcula Alticci"),
	    },
	    info = @Info(
	        title="Alticci",
	        version = "0.0.1")
	)
public class ExampleApiApplication extends Application{

}
