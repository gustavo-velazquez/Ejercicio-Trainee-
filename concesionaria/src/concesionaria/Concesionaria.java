
package concesionaria;

/**
 *
 * @author Gustavo Velazquez
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Concesionaria {
    
       public static void masCaro(vehiculo[] vehiculos){
        
        double mayor=0;
        String marca="",modelo="";
        
        for (int i = 0; i < vehiculos.length; i++) {
            
            if(vehiculos[i].getPrecio()>mayor){
                mayor=vehiculos[i].getPrecio();
                marca=vehiculos[i].getMarca();
                modelo=vehiculos[i].getModelo();
    
            }
            
        }
        
        System.out.println("Vehiculo mas caro: "+marca+" "+modelo+"\n");
           
    }
       
    public static void masBarato(vehiculo[] vehiculos){
        
        double menor=0;
        String marca="",modelo="";
        
        menor = vehiculos[0].getPrecio();
        marca=vehiculos[0].getMarca();
        modelo=vehiculos[0].getModelo();
        
        for (int i = 1; i < vehiculos.length; i++) {
            
            if(vehiculos[i].getPrecio()<menor){
                menor=vehiculos[i].getPrecio();
                marca=vehiculos[i].getMarca();
                modelo=vehiculos[i].getModelo();
    
            }
            
        }
        
        System.out.println("Vehiculo mas barato: "+marca+" "+modelo+"\n");
           
    }
    
    public static void letraY(vehiculo[] vehiculos){
        
        String modelo="",marca="";
        double precio=0;
        int j=0;

        for (int i = 0; i < vehiculos.length; i++) {
            
            modelo=vehiculos[i].getModelo();
                
                while((j<modelo.length())&&(modelo.charAt(j) != 'Y'))
                    j++;
                
                
                if(j<modelo.length())
                {
                    marca=vehiculos[i].getMarca();
                    precio=vehiculos[i].getPrecio();
                    System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+modelo+" "+marca+" $"+precio+"\n");
                }
            j=0;    
        }
            
    }
    
   
       

    public static void main(String[] args) {


        vehiculo a1 = new auto(4,"Peugeot","206",200000.00);
        vehiculo m1 = new moto("12cc","Honda","Titan",60000.00);
        vehiculo a2 = new auto(5,"Peugeot","208",250000.00);
        vehiculo m2 = new moto("160cc","Yamaha","YBR",80500.50);
 
       
        System.out.println(a1);
        System.out.println(m1);
        System.out.println(a2);
        System.out.println(m2);
        
         
        vehiculo lista[] = new vehiculo[4];
        
       
        lista[0]=a1;
        lista[1]=m1;
        lista[2]=a2;
        lista[3]=m2;
        
        masCaro(lista);
        masBarato(lista);
        letraY(lista);
        
        
         // Orden de vehiculo por precio (de mayor a menor).
        Arrays.sort(lista);
        System.out.println("Vehículos ordenados por precio de mayor a menor: \n");
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getMarca()+" "+lista[i].getModelo()+"\n");
        }
        


    }
    
}
