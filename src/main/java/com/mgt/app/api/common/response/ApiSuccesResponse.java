package com.mgt.app.api.common.response;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ApiSuccesResponse<B> extends ApiResponse{
	/**
	 * Response data.
	 */
	private Object responseObject;
	
	public ApiSuccesResponse(String message,B responseObj){
		super(message);
		this.responseObject=responseObj;
	}
	public ApiSuccesResponse(String message,int statusCode,Object responseObj){
		super(message,statusCode);
		this.responseObject=responseObj;
	}
}
