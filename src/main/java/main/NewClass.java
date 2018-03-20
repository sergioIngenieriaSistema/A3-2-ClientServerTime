/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author entrar
 */
public class NewClass {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL client = new URL("http://ws.docencia.ces.siani.es/a15/WSTime/webresources/generic");
        URLConnection connection = client.openConnection();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String rest = "";
        String line;
        while ((line = br.readLine()) != null) {            
            rest += line;
        }
        
        System.out.println("Response from the server: " + rest);
        br.close();
    }
}
