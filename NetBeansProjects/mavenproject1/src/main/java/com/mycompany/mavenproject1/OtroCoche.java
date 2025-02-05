/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Marcos
 */
public class OtroCoche {
        static int km;
        String modelo;
        String color;
        
        
        
        
        
        

    public OtroCoche(int km, String modelo, String color) {
        this.km = km;
        this.modelo = modelo;
        this.color = color;
    }
    
    
    public static int velocidad(int km, int h){
    
    int vel = km/h; 
    return vel;
    
    
    }
    public static int recorrido(int dist){
    
        return dist + km;
    
    }
    
    

    public int getKm() {
        return km;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public static void VerificyModel(String modelo){
    
        boolean noReconocido = true;
        String[]marcas = new String[10];
    
            marcas[0] = "a";
            marcas[1] = "b";
            marcas[2] = "c";
            marcas[3] = "d";
            marcas[4] = "e";
            marcas[5] = "f";
            marcas[6] = "g";
            marcas[7] = "h";
            marcas[8] = "i";
            marcas[9] = "j";
            
            for (String marca : marcas) {
                
                if (modelo.equals(marca)) {
                    
                    System.out.println("Marca Reconocida: " + marca);
                     noReconocido = false;
                    
                }  
     
        } 
           if (noReconocido) {
                    
                    System.out.println("Marca no Reconocida");
                    
                }

    }

}
