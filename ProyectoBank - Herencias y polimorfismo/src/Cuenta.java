public abstract class Cuenta {
     private int agencia;
     private int numero;
     private Cliente titular = new Cliente();
     protected double saldo;
     private static int total;

     Cuenta (int agencia, int numero){
          this.agencia = agencia;
          this.numero = numero;
          total ++;
     }
     public static int getTotal() {
         return total;
     }
     public Cliente getTitular() {
          return titular;
     }
     public void setTitular(Cliente titular) {
          this.titular = titular;
     }

     public abstract void depositar(double valor);


     public boolean retirar(double valor){
               if (valor <= this.saldo) {
                    this.saldo -= valor;
                    return true;
               }
               else{
                    System.out.println("No hay fondos suficientes");
                    return false;
               }
          }

     public boolean transferir(double valor, Cuenta cuenta) {
          if (valor <= this.saldo){
               this.saldo -= valor;
               cuenta.depositar(valor);
               return true;
          }
          else{
               System.out.println("No hay fondos suficientes");
                    return false;
          }
     }

     public double getSaldo () {
          return this.saldo;
     }

     public void setAgencia (int agencia) {
          if (agencia > 0 ){
               this.agencia = agencia;
          }
          else{
               System.out.println("Valor no valido");
          }
     }
     public int getAgencia(){
          return agencia;
     }

     public void setNumero (int numero) {
          if (numero > 0 ){
               this.numero = numero;
          }
          else{
               System.out.println("Valor no valido");
          }
     }
     
     public int getNumero(){
          return numero;
     }
}
