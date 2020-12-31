
package concesionaria;

/**
 *
 * @author Gustavo Velazquez
 */
public class vehiculo implements Comparable<vehiculo>{
    
    private String Marca;
    private String Modelo;
    private double Precio;

    public vehiculo() {
    }

    
    public vehiculo(String Marca, String Modelo, double Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }


    public double getPrecio() {
        return Precio;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }


    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    
    @Override
    public int compareTo(vehiculo o) {
            if (Precio > o.getPrecio() ){
                return -1;
            }
            if (Precio < o.getPrecio()) {
                return 1;
            }
            return 0;
        }
    
 
    
    
    
}
