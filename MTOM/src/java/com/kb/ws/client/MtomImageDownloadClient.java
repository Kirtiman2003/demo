/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kb.ws.client;

import com.kb.ws.MtomImageService;
import java.net.URL;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author kirti
 */
@WebService(serviceName = "MtomImageDownloadClient")
public class MtomImageDownloadClient {
    
    public static void main(String[] args) throws Exception{
        URL url = new URL("");
        QName qname= new QName("http://ws.kb.com/","MtomImageServiceImplService");
        
        Service service = Service.create(url,qname);
        
        MtomImageService imageService = service.getPort(MtomImageService.class);
        
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
