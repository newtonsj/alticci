package com.dellent.newton.service;

import java.math.BigInteger;

import javax.enterprise.context.ApplicationScoped;

import com.dellent.newton.dto.ExerciseResponseDTO;

import io.quarkus.cache.CacheResult;

@ApplicationScoped
public class AlticciSequenceService {

	@CacheResult(cacheName = "alticci-cache")
    public ExerciseResponseDTO getAlticciSequence(int number) throws Exception {
    	
		validate(number);

		BigInteger alticci = calcAlticci(number);

		ExerciseResponseDTO response = new ExerciseResponseDTO();
		response.setResult(alticci);

		return response;
	} 
    

    private BigInteger calcAlticci(int number) {

    	if(number == 0)
    		return BigInteger.ZERO;
    	else if (number <= 2)
    		return BigInteger.ONE;
    	else
    		return calcAlticci(number - 3).add(calcAlticci(number - 2));
		
	}
    
	private void validate(int number) throws Exception {
		
		if (number < 0) {
			throw new Exception("Invalid number");
		}
	}

}
