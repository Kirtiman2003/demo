/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ty;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kirti
 */
@WebService(serviceName = "tempwebservice")
public class tempwebservice {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "convertCtoF")
    public float convertCtoF(@WebParam(name = "a") float a) {
        //TODO write your implementation code here:
        return ((a-32)*9/5);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "convertFtoC")
    public float convertFtoC(@WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        return ((b*9/5)+32);
    }
}
