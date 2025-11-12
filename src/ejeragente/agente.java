package ejeragente;

public class agente {
    private String nombre;
    private int nivelEnergia;  // Rango 0–100
    private String estado;     // "activo" o "inactivo"

    // Constructor
    public agente(String nombre, int nivelEnergia, String estado) {
        this.nombre = nombre;
        this.nivelEnergia = nivelEnergia;
        this.estado = estado;
    }

    // Métodos set
    public void setNivelEnergia(int nivelEnergia) {
        if (nivelEnergia >= 0 && nivelEnergia <= 100)
            this.nivelEnergia = nivelEnergia;
    }

    public void setEstado(String estado) {
        if (estado.equalsIgnoreCase("activo") || estado.equalsIgnoreCase("inactivo"))
            this.estado = estado;
    }

    // Métodos get
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public String getEstado() {
        return estado;
    }

    // Método utilitario
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel de energía: " + nivelEnergia);
        System.out.println("Estado: " + estado);
    }
}
