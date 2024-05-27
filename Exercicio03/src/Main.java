import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de Variaves
        String nome;
        double salarioAtual, valorEmprestimo;

        // Criação do Objeto Scanner
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao sistema de emprestimos");

        // Entrada de Dados
        System.out.println("\nInsira seu nome");
        nome = ler.nextLine();

        System.out.println("\nInsira o valor do seu salário");
        salarioAtual = ler.nextDouble();

        System.out.println("\nInsira o valor de empréstimo desejado");
        valorEmprestimo = ler.nextDouble();

        EntradaSaida entradaSaida = new EntradaSaida(salarioAtual, valorEmprestimo);
        entradaSaida.executarValidacao();

        Calculo calculo = new Calculo(entradaSaida);

        System.out.printf("\nO valor final do empréstimo é de %.2f", calculo.CalcularJuros());
        System.out.printf("\nO das parcelas é %.2f em 24 vezes", calculo.CalcularParcela());
    }
}