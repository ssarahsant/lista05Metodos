import java.util.Scanner;

public class EntradaSaida {
    // Atributos
    double salarioAtual;
    double valorEmprestimo;

    Validacao validacao;

    // Método Construtor
    public EntradaSaida(double salarioAtual, double valorEmprestimo) {
        this.salarioAtual = salarioAtual;
        this.valorEmprestimo = valorEmprestimo;
        // cria uma instancia de entradaSaida
        var entradaSaida = this;
        // dentro da propria classe se instancia um objeto de entradaSaida
        validacao = new Validacao(new Calculo(entradaSaida));
    }

    // Excução do Método de Validação
    public void executarValidacao() {

        boolean validacaoSalario = validacao.ValidacaoSalario();
        boolean validacaoParcela = validacao.ValidacaoParcela();

        Scanner ler = new Scanner(System.in);

        while (!validacaoSalario || !validacaoParcela) {
            if (!validacaoSalario) {
                System.out.println("Valor de parcela execedida. Por favor, insira um valor menor.");
                // Criação do Objeto Scanner
                System.out.println("\nInsira novamente o valor do emprestimo");
                this.valorEmprestimo = ler.nextDouble();
                validacaoSalario = validacao.ValidacaoSalario();
            } else if (!validacaoParcela) {
                System.out.println("Valor de empréstimo invalido. Por favor, insira um valor máximo de R$200.000,00.");
                // Criação do Objeto Scanner
                System.out.println("\nInsira novamente o valor do emprestimo");
                this.valorEmprestimo = ler.nextDouble();
                validacaoParcela = validacao.ValidacaoParcela();
            }
        }

    }
}