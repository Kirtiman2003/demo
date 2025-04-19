/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kb.ws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author kirti
 */
public class MtomImagePublisher {
    
    public static void main(String[] args){
        Endpoint endpoint = Endpoint.create(new MtomImageServiceImpl());
        endpoint.publish("http://localhost:8888/ws/mtom/image");
        
        
    
    }
    
}
