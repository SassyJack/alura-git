public class AutenticacionUtil {
    
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
        return;
    }

    public boolean iniciarSesion(String clave) {
        if (this.clave == clave){
            return true;
        }
        else{
        return false;
        }
    }
}
