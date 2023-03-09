public class SistemaInterno {
    private String clave = "AluraCursos";

    public boolean autenticar(Autenticable usuario){
        boolean puedeIniciarSesion = usuario.iniciarSesion(this.clave);
        if(puedeIniciarSesion){
            System.out.println("Login Exitoso");
            return true;
        }
        else{
            System.out.println("Error de Login");
            return false;
        }
    }
}
