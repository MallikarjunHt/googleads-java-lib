
package com.google.api.ads.dfp.jaxws.v201502;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "InventoryService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201502/InventoryService?wsdl")
public class InventoryService
    extends Service
{

    private final static URL INVENTORYSERVICE_WSDL_LOCATION;
    private final static WebServiceException INVENTORYSERVICE_EXCEPTION;
    private final static QName INVENTORYSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201502", "InventoryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201502/InventoryService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INVENTORYSERVICE_WSDL_LOCATION = url;
        INVENTORYSERVICE_EXCEPTION = e;
    }

    public InventoryService() {
        super(__getWsdlLocation(), INVENTORYSERVICE_QNAME);
    }

    public InventoryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns InventoryServiceInterface
     */
    @WebEndpoint(name = "InventoryServiceInterfacePort")
    public InventoryServiceInterface getInventoryServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "InventoryServiceInterfacePort"), InventoryServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InventoryServiceInterface
     */
    @WebEndpoint(name = "InventoryServiceInterfacePort")
    public InventoryServiceInterface getInventoryServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "InventoryServiceInterfacePort"), InventoryServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INVENTORYSERVICE_EXCEPTION!= null) {
            throw INVENTORYSERVICE_EXCEPTION;
        }
        return INVENTORYSERVICE_WSDL_LOCATION;
    }

}
