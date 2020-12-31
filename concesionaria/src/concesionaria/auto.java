
package concesionaria;

/**
 *
 * @author Gustavo Velazquez
 */

public class auto extends vehiculo{
    
    
    private int Puertas;

    public auto() {
    }

    public auto(int Puertas, String Marca, String Modelo, double Precio) {
        super(Marca, Modelo, Precio);
        this.Puertas = Puertas;
    }
    
    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }
    
    
    @Override
    public String toString() {
    return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Puertas: "+Puertas+" // Precio: $"+String.format("%.2f", getPrecio())+"\n";
    }
    
    
    
}
