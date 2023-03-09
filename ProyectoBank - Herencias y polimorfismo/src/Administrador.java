public class Administrador extends Funcionario implements Autenticable{

    @Override
    public double getBonificacion() {
        return 0;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

    @Override
    public void setClave(String clave) {
        
    }
    
}
