public class Administrador extends Funcionario implements Autenticable{
    private AutenticacionUtil util;

    Administrador(){
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }
    
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    public void setClave(String clave) {
     this.util.setClave(clave);  
    }


    
}
