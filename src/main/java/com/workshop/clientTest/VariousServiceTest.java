package com.workshop.clientTest;

import com.workshop.client.VariousServiceImpl;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mijo on 2016-05-13.
 */
public class VariousServiceTest {

    public String callDisplayName() {
        VariousServiceImpl variousService = null;
        try {
            variousService = new VariousServiceImpl(new URL("http://localhost:8080/workshop_ws/VariousService?wsdl"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String result = variousService.getVariousServicePort().displayName("Michael");

        System.out.println(result);
        return result;
    }
}
