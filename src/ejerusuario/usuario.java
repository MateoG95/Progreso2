package ejerusuario;

public class usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasenia;


    //contructor
    public usuario(){

    }

    //constructor por parametros
    public usuario(String nombreUsuario, String correo, String contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        setContrasenia(contrasenia);
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        if(contrasenia.length() >=8 )
            this.contrasenia = contrasenia;
    }

    public String getNombreusuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void mostrarDatos(){
        System.out.println("Usuario: "+nombreUsuario+"\nCorreo: "+correo);
        System.out.println("Contrasenia: No mostrar "+contrasenia);
    }
}
