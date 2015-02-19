
package com.google.api.ads.adwords.jaxws.v201406.cm;

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
 *       This service is used for managing {@link SharedSet} entities themselves
 *       and the association between sets and campaigns.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SharedSetServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SharedSetServiceInterface {


    /**
     * 
     *         Returns a list of SharedSets based on the given selector.
     *         @param selector the selector specifying the query
     *         @return a list of SharedSet entities that meet the criterion specified
     *         by the selector
     *         @throws ApiException
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.cm.SharedSetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.cm.SharedSetServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.cm.SharedSetServiceInterfacegetResponse")
    public SharedSetPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations.
     *         @param operations the operations to apply
     *         @return the modified CriterionList entities
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.cm.SharedSetReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.cm.SharedSetServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.cm.SharedSetServiceInterfacemutateResponse")
    public SharedSetReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406")
        List<SharedSetOperation> operations)
        throws ApiException_Exception
    ;

}
