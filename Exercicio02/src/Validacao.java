public class Validacao {
    // Método Construtor
    public Validacao(double salarioBruto) {

    }

    // Método de Ação
    boolean validacaoSalario (double salarioBruto) {
        return (salarioBruto >= 500.00) && (salarioBruto <= 30000.00);
    }

}
