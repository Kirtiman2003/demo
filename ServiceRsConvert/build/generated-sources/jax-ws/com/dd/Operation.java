
package com.dd;

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
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Operation", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:44367/Operation.asmx?WSDL")
public class Operation
    extends Service
{

    private final static URL OPERATION_WSDL_LOCATION;
    private final static WebServiceException OPERATION_EXCEPTION;
    private final static QName OPERATION_QNAME = new QName("http://tempuri.org/", "Operation");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:44367/Operation.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERATION_WSDL_LOCATION = url;
        OPERATION_EXCEPTION = e;
    }

    public Operation() {
        super(__getWsdlLocation(), OPERATION_QNAME);
    }

    public Operation(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERATION_QNAME, features);
    }

    public Operation(URL wsdlLocation) {
        super(wsdlLocation, OPERATION_QNAME);
    }

    public Operation(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERATION_QNAME, features);
    }

    public Operation(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Operation(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperationSoap
     */
    @WebEndpoint(name = "OperationSoap")
    public OperationSoap getOperationSoap() {
        return super.getPort(new QName("http://tempuri.org/", "OperationSoap"), OperationSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationSoap
     */
    @WebEndpoint(name = "OperationSoap")
    public OperationSoap getOperationSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "OperationSoap"), OperationSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns OperationSoap
     */
    @WebEndpoint(name = "OperationSoap12")
    public OperationSoap getOperationSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "OperationSoap12"), OperationSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationSoap
     */
    @WebEndpoint(name = "OperationSoap12")
    public OperationSoap getOperationSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "OperationSoap12"), OperationSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERATION_EXCEPTION!= null) {
            throw OPERATION_EXCEPTION;
        }
        return OPERATION_WSDL_LOCATION;
    }

}
