public class Gerente extends Funcionario implements Autenticable {
    private AutenticacionUtil util;

    Gerente(){
        this.util = new AutenticacionUtil();
    }

    public double getBonificacion () {
        return super.getSalario();
    }

    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    public void setClave(String clave) {
     this.util.setClave(clave);  
    }

}
