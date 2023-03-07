public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setDocumento(1000455897);
        funcionario1.setNombre("Ramon");
        funcionario1.setSalario(3000000);

        System.out.println(funcionario1.getBonificacion());

        Gerente gerente1 = new Gerente();

        gerente1.setSalario(5000000);
        System.out.println(gerente1.getBonificacion());
    }
}
