public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta=new Cuenta();
        primeraCuenta.depositar(1000); 
        
        Cuenta segundaCuenta=new Cuenta();
        segundaCuenta.depositar(2000);

        System.out.println(primeraCuenta.getSaldo());
        System.out.println(segundaCuenta.getSaldo());
        primeraCuenta.setAgencia(20);
        primeraCuenta.setNumero(421341);
        System.out.println(primeraCuenta.getAgencia());
        System.out.println(primeraCuenta.getNumero());
    }
}
