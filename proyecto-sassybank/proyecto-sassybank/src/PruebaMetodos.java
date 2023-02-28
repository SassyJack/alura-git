public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaRamon = new Cuenta();

        cuentaRamon.saldo = 500;
        cuentaRamon.depositar(300);

        System.out.println(cuentaRamon.saldo);
    }
}
