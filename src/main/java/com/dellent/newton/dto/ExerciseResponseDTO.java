package com.dellent.newton.dto;

import java.math.BigInteger;

public class ExerciseResponseDTO {

	private BigInteger result;

	public BigInteger getResult() {
		return result;
	}

	public void setResult(BigInteger result) {
		this.result = result;
	}
	
	public String toStringResult() {
		return String.valueOf(result);
	}
}
