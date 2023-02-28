public class Cuenta {
     int agencia;
     int numero;
     String titular;
     double saldo;

     public void depositar(double valor){
          //El this esta es una referencia, es decir, "apunta" a un objeto.
          this.saldo += valor;
     }
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
     
}
