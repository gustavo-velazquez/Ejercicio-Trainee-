
package concesionaria;

/**
 *
 * @author Gustavo Velazquez
 */
public class moto extends vehiculo{
    
    private String Cilindrada;

    public moto() {
    }

    public moto(String Cilindrada, String Marca, String Modelo, double Precio) {
        super(Marca, Modelo, Precio);
        this.Cilindrada = Cilindrada;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    @Override
    public String toString() {
    return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Cilindrada: "+Cilindrada+" // Precio: $"+getPrecio()+"\n";
    }
    
}
