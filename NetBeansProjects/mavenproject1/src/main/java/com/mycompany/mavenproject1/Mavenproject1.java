/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Marcos
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        OtroCoche coche1 = new OtroCoche(15,"f","asd");
        
                System.out.println(OtroCoche.recorrido(100));

                System.out.println(coche1.getKm()); 
        
        OtroCoche coche2 = new OtroCoche(20,"assd","assd");
        
                System.out.println(OtroCoche.recorrido(1000));
                  

                
                
                System.out.println(coche2.getKm()); 



        OtroCoche coche3 = new OtroCoche(40, "a","rojo");
        
                  OtroCoche.VerificyModel(coche3.getModelo());
                  System.out.println("--------------------------------");
                  
                  OtroCoche.VerificyModel(coche1.getModelo());
                
        
           
                
    
                
         
                
    }
}
