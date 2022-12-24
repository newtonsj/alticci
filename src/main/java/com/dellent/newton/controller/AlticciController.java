package com.dellent.newton.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

import com.dellent.newton.service.AlticciSequenceService;

@Path("/alticci")
public class AlticciController {

	@Inject
	private AlticciSequenceService service;
	
	@GET
	@Path("/{n}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Operation(summary = "Sequência Alticci", 
    	description = "Retorna o valor da sequência de acordo com o número informado")
	public RestResponse<String> calculateAlticci(int n) {
		
		try {
			
			return ResponseBuilder.ok(service.getAlticciSequence(n).toStringResult(),
					MediaType.TEXT_PLAIN_TYPE)
			         .build();
			
		} catch (Exception e) {
					return ResponseBuilder.ok(e.getMessage(),
							MediaType.TEXT_PLAIN_TYPE)
					         .build();
		}
	}
}
