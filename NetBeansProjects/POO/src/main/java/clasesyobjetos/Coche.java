/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesyobjetos;

/**
 *
 * @author Marcos
 */
public class Coche {
    
    
       int km;
        String modelo;
        String color;

    public Coche(int km, String modelo, String color) {
        this.km = km;
        this.modelo = modelo;
        this.color = color;
    }
    
    public static int velocidad(int km, int h){
    
    int vel = km/h; 
    return vel;
    
    
    }
    
    
         
    
    
    
    
}
