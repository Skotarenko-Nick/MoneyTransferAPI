package com.revolut.model;

public class SuccessfulOperationWithJSONBodyResponsePayload extends EndpointOperationResponsePayload {

    public SuccessfulOperationWithJSONBodyResponsePayload(int statusCode, String endpointResponseBody) {
        super(statusCode, endpointResponseBody, "");
    }
}
