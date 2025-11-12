package ejerproducto;

public class ProductoDigital {
    private String nombre;
    private double precio;
    private int stock;

    //constructor
    public ProductoDigital(){

    }

    //constructor por parametros
    public ProductoDigital(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        this.stock = stock;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio > 0);
        this.precio = precio;
    }



    public void setStock(int stock) {
        if (stock < 0);
        this.stock = 0;
    }


    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }


    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}


