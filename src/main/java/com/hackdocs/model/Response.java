package com.hackdocs.model;

import com.hackdocs.model.response.Payload;
import lombok.Data;

@Data
public class Response {

    Payload payload;

//    String fulfillmentText;
//    List<FulfillmentMessage> fulfillmentMessages;
//    String source;
//    List<OutputContext> outputContexts;
//    FollowupEventInput followupEventInput;


    public Response(Payload payload) {
        this.payload = payload;
    }

}