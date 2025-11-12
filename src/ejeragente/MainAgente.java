package ejeragente;

public class MainAgente {
    public static void main(String[] args) {

        agente a1 = new agente("Alpha", 90, "activo");
        agente a2 = new agente("Beta", 50, "inactivo");

        System.out.println("-----Datos Agente 1-----");
        a1.mostrarEstado();

        System.out.println("-----Datos Agente 2-----");
        a2.mostrarEstado();

        a2.setNivelEnergia(75);
        a2.setEstado("activo");

        System.out.println("----Datos Agente 2 luego de cambio----");
        a2.mostrarEstado();
    }
}
