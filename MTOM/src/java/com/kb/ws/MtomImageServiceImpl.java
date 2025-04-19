/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kb.ws;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

@WebService(endpointInterface="com.kb.ws.MtomImageService")
@MTOM(threshold=10)

public class MtomImageServiceImpl implements MtomImageService{
    
    @Override
    public String uploadImage(Image imageData){
        if(null != imageData){
            return "Image Upload Successfuly";
        }
        throw new WebServiceException("Image Upload Failed!");
    }
    @Override
    public Image downloadImage(String imageName){
        File image = new File("C:\\Users\\kirti\\OneDrive\\Documents\\NetBeansProjects\\demo\\MTOM\\src\\java\\com\\kb\\ws"+imageName);
        
        try{
            return ImageIO.read(image);
            
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

   


}