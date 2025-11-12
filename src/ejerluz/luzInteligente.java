package ejerluz;

public class luzInteligente {
    private String idLuz;
    private boolean estado;
    private int nivelBrillo;

    //contructor
    public luzInteligente(){

    }

    //constructor por parametros
    public luzInteligente(String idLuz, boolean estado, int ajustarBrillo) {
        this.idLuz = idLuz;
        this.estado = estado;
        setNivelBrillo(nivelBrillo);
    }

    //constructor por idLuz
    public luzInteligente (String idLuz) {
        this.idLuz = idLuz;
        this.estado = false;
        this.nivelBrillo = 0;
    }

    public String getIdLuz() {
        return idLuz;
    }

    public int getNivelBrillo(){ return nivelBrillo;}

    public void encendido(){
        if (estado == false){
        estado= true; }}

    public void apagado(){
        if (estado){
        estado= false;
        nivelBrillo = 0;
        }}

    public void setNivelBrillo(int nivelBrillo ) {
        if (estado){
        if (nivelBrillo > 0 && nivelBrillo <= 100)
            this.nivelBrillo=nivelBrillo;

            else {System.out.println(" El Nivel del Brillo es Incorrecto. Se serteara a un nivel 20");
            nivelBrillo=20;
            }
        }
        else System.out.println("La Luz esta apagada");
    }


    public void mostrarDatos(){
        String estado=  "Prendido, Apagado";
        System.out.println("La Luz se encuentra" +estado);
        System.out.println("El nivel del brillo es: " +nivelBrillo);

    }
    
}
