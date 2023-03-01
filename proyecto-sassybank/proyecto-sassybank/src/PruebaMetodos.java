public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaRamon = new Cuenta();
        Cuenta cuentaPipe = new Cuenta();
        cuentaRamon.saldo = 500;
        cuentaRamon.depositar(300);
        System.out.println(cuentaRamon.saldo);
        cuentaRamon.retirar(1000);
        System.out.println(cuentaRamon.saldo);
        cuentaPipe.depositar(10000);
        cuentaPipe.transferir(200,cuentaRamon);
        System.out.println(cuentaPipe.saldo);
        System.out.println(cuentaRamon.saldo);

        Cliente Ramon = new Cliente();
        cuentaRamon.titular = Ramon;
        Ramon.nombre = "Ramon";
        System.out.println(Ramon.nombre);
        System.out.println(cuentaRamon.titular.nombre);
    }
}
