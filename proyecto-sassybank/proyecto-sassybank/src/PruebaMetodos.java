public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaRamon = new Cuenta();
        Cuenta cuentaPipe = new Cuenta();
        cuentaRamon.depositar(500); 
        cuentaRamon.depositar(300);
        System.out.println(cuentaRamon.getSaldo());
        cuentaRamon.retirar(1000);
        System.out.println(cuentaRamon.getSaldo());
        cuentaPipe.depositar(10000);
        cuentaPipe.transferir(200,cuentaRamon);
        System.out.println(cuentaPipe.getSaldo());
        System.out.println(cuentaRamon.getSaldo());

        Cliente Ramon = new Cliente();
        cuentaRamon.setTitular(Ramon);
        Ramon.setNombre("Ramon");
        System.out.println(Ramon.getNombre());
        System.out.println(cuentaRamon.getTitular().getNombre());
        System.out.println(cuentaRamon.getTitular());
        System.out.println(Ramon);
    }
}
