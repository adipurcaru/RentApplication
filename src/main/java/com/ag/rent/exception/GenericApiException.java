package com.ag.rent.exception;

import lombok.Getter;

@Getter
public class GenericApiException extends RuntimeException {

	private String httpStatusCode;

	/**
	 * 
	 */
	private static final long serialVersionUID = -2569486975665300276L;

	public GenericApiException(String httpStatusCode, String errorMessage) {
		super(errorMessage);
		this.httpStatusCode = httpStatusCode;
	}

}
