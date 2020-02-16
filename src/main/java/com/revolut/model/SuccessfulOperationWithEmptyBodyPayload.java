package com.revolut.model;

public class SuccessfulOperationWithEmptyBodyPayload  extends EndpointOperationResponsePayload{
    public SuccessfulOperationWithEmptyBodyPayload(int statusCode) {
        super(statusCode, "", "");
    }
}
