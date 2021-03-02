package com.mgt.app.api.common.response;

import org.springframework.http.HttpStatus;

import lombok.Data;

/**
 * ApiReponse Base Class
 * 
 * @author stami
 *
 */
@Data
public class ApiResponse {

	/**
	 * Response message
	 */
	private String description;
	
	/**
	 * status code for internal status 
	 */
	private int statusCode;
	
	public ApiResponse(String description){
		this.description=description;
	}
	public ApiResponse(String description,int statusCode){
		this.description=description;
		this.statusCode=statusCode;
	}
}
