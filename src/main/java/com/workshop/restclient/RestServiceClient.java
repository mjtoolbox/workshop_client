package com.workshop.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by mijo on 2016-05-18.
 */
public class RestServiceClient {

    private String BASE_URL = "http://localhost:8080/workshop_ws/rs/restservice";

    public String getUserName(String aName) {

        Client client = ClientBuilder.newClient();
        WebTarget myResource = client.target(BASE_URL).path(aName);
        Response response = null;

        String result = "";

        try {
            response = myResource.request(MediaType.TEXT_PLAIN).get();
            result = response.readEntity(String.class);

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
