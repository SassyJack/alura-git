public class SistemaInterno {
    private String clave = "AluraCursos";

    public boolean autenticar(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion("AluraCursos");
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
