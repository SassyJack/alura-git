public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta=new Cuenta();
        primeraCuenta.depositar(1000); 
        
        Cuenta segundaCuenta=new Cuenta();
        segundaCuenta.depositar(2000);

        System.out.println(primeraCuenta.obtenerSaldo());
        System.out.println(segundaCuenta.obtenerSaldo());
    }
}
