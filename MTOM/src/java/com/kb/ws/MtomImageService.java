/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kb.ws;

import java.awt.Image;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.RPC)
public interface MtomImageService{
    
    @WebMethod
    String uploadImage(Image imageData);
    
    @WebMethod
    Image downloadImage(String imageName);
    
}