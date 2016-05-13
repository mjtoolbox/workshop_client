
package com.workshop.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.workshop.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DisplayName_QNAME = new QName("http://www.mjtoolbox.com/workshop", "displayName");
    private final static QName _DisplayNameResponse_QNAME = new QName("http://www.mjtoolbox.com/workshop", "displayNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.workshop.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayNameResponse }
     * 
     */
    public DisplayNameResponse createDisplayNameResponse() {
        return new DisplayNameResponse();
    }

    /**
     * Create an instance of {@link DisplayName }
     * 
     */
    public DisplayName createDisplayName() {
        return new DisplayName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mjtoolbox.com/workshop", name = "displayName")
    public JAXBElement<DisplayName> createDisplayName(DisplayName value) {
        return new JAXBElement<DisplayName>(_DisplayName_QNAME, DisplayName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mjtoolbox.com/workshop", name = "displayNameResponse")
    public JAXBElement<DisplayNameResponse> createDisplayNameResponse(DisplayNameResponse value) {
        return new JAXBElement<DisplayNameResponse>(_DisplayNameResponse_QNAME, DisplayNameResponse.class, null, value);
    }

}
