public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaRamon = new Cuenta();
        Cuenta cuentaPipe = new Cuenta();
        cuentaRamon.depositar(500); 
        cuentaRamon.depositar(300);
        System.out.println(cuentaRamon.obtenerSaldo());
        cuentaRamon.retirar(1000);
        System.out.println(cuentaRamon.obtenerSaldo());
        cuentaPipe.depositar(10000);
        cuentaPipe.transferir(200,cuentaRamon);
        System.out.println(cuentaPipe.obtenerSaldo());
        System.out.println(cuentaRamon.obtenerSaldo());

        Cliente Ramon = new Cliente();
        cuentaRamon.titular = Ramon;
        Ramon.nombre = "Ramon";
        System.out.println(Ramon.nombre);
        System.out.println(cuentaRamon.titular.nombre);
        System.out.println(cuentaRamon.titular);
        System.out.println(Ramon);
    }
}
