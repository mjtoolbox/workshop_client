
package com.workshop.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VariousService", targetNamespace = "http://www.mjtoolbox.com/workshop")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VariousService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "displayNameResult", targetNamespace = "")
    @RequestWrapper(localName = "displayName", targetNamespace = "http://www.mjtoolbox.com/workshop", className = "com.workshop.client.DisplayName")
    @ResponseWrapper(localName = "displayNameResponse", targetNamespace = "http://www.mjtoolbox.com/workshop", className = "com.workshop.client.DisplayNameResponse")
    @Action(input = "http://www.mjtoolbox.com/workshop/VariousService/displayNameRequest", output = "http://www.mjtoolbox.com/workshop/VariousService/displayNameResponse")
    public String displayName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}