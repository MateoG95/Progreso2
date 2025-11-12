package ejerluz;

import javax.swing.JOptionPane;

public class MainLuz {
    public static void main(String[] args) {
    luzInteligente l1= new luzInteligente();
    luzInteligente l2= new luzInteligente();


        JOptionPane.showInputDialog(null, "Ingrese el Id de la Luz");

        l1.setCorreo("Bsandoval@udla.edu.ec");
        l1.setContrasenia("sandoval");
        System.out.println("-----Datos Usuario 1-----");
        l1.mostrarDatos();

        System.out.println("-----Datos Usuario 2-----");
        l2.mostrarDatos();

        l2.setContrasenia("sandoval123");
        System.out.println("----Datos Usuario 1 luego de cambio----");
        l2.mostrarDatos();

        l2.setContrasenia("dududududu");
        System.out.println("Datos modificacion contrasenia usuario 2");
        l2.mostrarDatos();



    }
}
