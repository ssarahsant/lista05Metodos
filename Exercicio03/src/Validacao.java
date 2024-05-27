public class Validacao {
    // Atributos
    double salarioAtual;
    double valorEmprestimo;
    Calculo calculo;

    public Validacao(double salarioAtual, double valorEmprestimo) {
        this.salarioAtual = salarioAtual;
        this.valorEmprestimo = valorEmprestimo;
    }

    // Método Construtor
    public Validacao(Calculo calculo) {
        this.calculo = calculo;
        this.salarioAtual = calculo.salarioAtual;
        this.valorEmprestimo = calculo.valorEmprestimo;
    }
    boolean ValidacaoSalario () {
        return (valorEmprestimo <= 200000);
    }

    boolean ValidacaoParcela () {
        return (calculo.CalcularParcela() <= (salarioAtual * (15.00/100.00)));
    }
}
