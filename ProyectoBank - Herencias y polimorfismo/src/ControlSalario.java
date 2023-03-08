public class ControlSalario {
    private double suma;

    public double getSuma() {
        return suma;
    }

    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + suma;
        System.out.println("El calculo actual va en: " + this.suma);
        return this.suma;
    }
}
