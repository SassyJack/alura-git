public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cCorriente = new CuentaCorriente(23, 666);
        CuentaAhorros cAhorros = new CuentaAhorros(32, 777);

        cCorriente.depositar(5000);
        cAhorros.depositar(2000);

        cCorriente.transferir(1000, cAhorros);

        System.out.println(cCorriente.getSaldo());
        System.out.println(cAhorros.getSaldo());

    }
}
