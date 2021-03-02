package com.mgt.app.api.common.response;


import lombok.Data;

@Data
public class ApiFailureResponse extends ApiResponse {
	public ApiFailureResponse(String message, int statusCode) {
		super(message, statusCode);
	}
}
