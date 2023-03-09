public class Gerente extends Funcionario implements Autenticable {

    public double getBonificacion () {
        return super.getSalario();
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

    @Override
    public void setClave(String clave) {
      return;  
    }

}
