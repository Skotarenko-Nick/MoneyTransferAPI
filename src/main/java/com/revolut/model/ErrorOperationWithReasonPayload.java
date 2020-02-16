package com.revolut.model;

public class ErrorOperationWithReasonPayload extends EndpointOperationResponsePayload {
    public ErrorOperationWithReasonPayload(int statusCode, String errorReason) {
        super(statusCode, "", errorReason);
    }
}
