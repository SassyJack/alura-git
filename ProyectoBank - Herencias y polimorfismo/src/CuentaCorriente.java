public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero){
        super(agencia, numero);
    }

    
    @Override
    public boolean transferir(double valor, Cuenta cuenta) {
        if (valor <= super.getSaldo()){
            double comision = 200;
            super.retirar(valor + comision); 
            cuenta.depositar(valor);
            return true;
       }
       else{
            System.out.println("No hay fondos suficientes");
                 return false;
       }
    }
}
