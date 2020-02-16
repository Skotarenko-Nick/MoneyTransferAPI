package com.revolut.util;

import com.revolut.model.EndpointOperationResponsePayload;
import spark.Response;

public class ResponseCreatorImpl implements ResponseCreator {

    @Override
    public String respondToHttpEndpoint(Response response, EndpointOperationResponsePayload endpointOperationResponsePayload) {
        response.type("application/json");
        response.status(endpointOperationResponsePayload.getStatusCode());

        String messageResponseBodyWhenDataIsEmpty = endpointOperationResponsePayload.getErrorReason();
        String messageResponseBodyWhenDataIsPresent = endpointOperationResponsePayload.getEndpointResponseBody();


        return (endpointOperationResponsePayload.getEndpointResponseBody().isEmpty())
                ? messageResponseBodyWhenDataIsEmpty
                : messageResponseBodyWhenDataIsPresent;
    }
}
