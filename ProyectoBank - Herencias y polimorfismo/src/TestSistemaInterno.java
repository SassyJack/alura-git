public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador admin = new Administrador();

        gerente.setClave("AluraCursos");

        sistema.autenticar(gerente);
        sistema.autenticar(admin);
    }
}
