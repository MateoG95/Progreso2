package ejerproducto;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String nombre;
        double precio;
        int stock;


        ProductoDigital pd = null;
        System.out.println("Ingrese el nombre");
        nombre = sc.next();
        System.out.println("Ingrese el precio");
        precio = sc.nextDouble();
        System.out.println("Ingrese el stock");
        stock = sc.nextInt();

        pd = new ProductoDigital(nombre,precio,stock);
        pd.mostrarDatos();



    }
}
