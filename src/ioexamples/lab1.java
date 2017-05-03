/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.io.*;
import java.util.*;


/**
 *
 * @author jerem
 */
public class lab1 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File f = new File("src" + File.separatorChar + "Addresses");
        List<Address> addressList = new ArrayList<>();
        BufferedReader b;
        
         b = new BufferedReader(new FileReader(f));
	   String line = b.readLine();
	   while(line != null){
               
               String[] addressParts = line.split(" ");
               int numberOfParts = addressParts.length;
               int streetIndicatorNumber = 0;
               
               
               String zipCode = addressParts[numberOfParts - 1];
               String state = addressParts[numberOfParts - 2];
               
               
               for (int i = 0; i < addressParts.length; i++){//This would be more effiecient with a Collection of some sort and a nested for loop.
               
               switch (addressParts[i]){
               
                   case "Street":
                       streetIndicatorNumber = i;
                   
                   case "Road":
                       streetIndicatorNumber = i;
                   
                   case "Rd.":
                       streetIndicatorNumber = i;
                   
                   case "St.":
                       streetIndicatorNumber = i;
               
               }
               
               }
               String city = "";
               for (int i = streetIndicatorNumber + 1; i < (numberOfParts - 1); i++){
               
                   city += addressParts[i] + " ";
               
               }
               
               String address = "";
               for (int i = 0; i < streetIndicatorNumber +1; i++){
               
                   address += addressParts[i] + " ";
               
               
               }
               

               
               System.out.println("");
               System.out.println("Testing Single Split Formula");
               System.out.println("");
		  System.out.println(address);
                  System.out.println(city);
                  System.out.println(state);
                  System.out.println(zipCode);
                  
                  addressList.add(new Address(address, city, state, zipCode));
                  
                  
		  line = b.readLine();
        
    }b.close();
           
           System.out.println("");
           System.out.println("Using List");
           System.out.println("");
          for (Address a : addressList){
          
              System.out.println(a);
          
          }

    
    }
    
}
