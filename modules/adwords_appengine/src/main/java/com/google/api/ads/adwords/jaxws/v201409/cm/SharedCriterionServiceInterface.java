
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Manages which criteria are associated with shared sets.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SharedCriterionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SharedCriterionServiceInterface {


    /**
     * 
     *         Returns a list of SharedCriterion that meets the selector criteria.
     *         
     *         @param selector filters the criteria returned
     *         @return The list of SharedCriterion
     *         @throws ApiException
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201409.cm.SharedCriterionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.SharedCriterionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.SharedCriterionServiceInterfacegetResponse")
    public SharedCriterionPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, removes criteria in a shared set.
     *         
     *         @param operations A list of unique operations
     *         @return The list of updated SharedCriterion, returned in the same order as the
     *         {@code operations} array.
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201409.cm.SharedCriterionReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.SharedCriterionServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.SharedCriterionServiceInterfacemutateResponse")
    public SharedCriterionReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
        List<SharedCriterionOperation> operations)
        throws ApiException_Exception
    ;

}
