public class Calculo {
    // Atributos
    EntradaSaida entradaSaida;
    double salarioAtual;
    double valorEmprestimo;

    // Método Construtor
    public Calculo(EntradaSaida entradaSaida) {
        this.entradaSaida = entradaSaida;
        this.salarioAtual = entradaSaida.salarioAtual;
        this.valorEmprestimo = entradaSaida.valorEmprestimo;
    }

    double CalcularJuros (){
        return valorEmprestimo + (valorEmprestimo * (35.00 / 100.00));
    }

    double CalcularParcela() {
        return CalcularJuros() / 24;
    }

}
