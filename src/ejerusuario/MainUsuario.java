package ejerusuario;

public class MainUsuario {
    public static void main(String[] args) {

        usuario u1 = new usuario();
        usuario u2 = new usuario("BenjaSando","Bsandov@udla.edu.ec", "S4nd0val");

        u1.setNombreUsuario("Bsandoval");
        u1.setCorreo("Bsandoval@udla.edu.ec");
        u1.setContrasenia("sandoval");
        System.out.println("-----Datos Usuario 1-----");
        u1.mostrarDatos();

        System.out.println("-----Datos Usuario 2-----");
        u2.mostrarDatos();

        u1.setContrasenia("sandoval123");
        System.out.println("----Datos Usuario 1 luego de cambio----");
        u1.mostrarDatos();

        u2.setContrasenia("dududududu");
        System.out.println("Datos modificacion contrasenia usuario 2");
        u2.mostrarDatos();

    }
}