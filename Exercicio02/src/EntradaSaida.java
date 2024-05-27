import java.util.Scanner;

public class EntradaSaida {
    // Atributos
    double salarioBruto;
    double horaExtra;

    // Método Construtor
    public EntradaSaida(double salarioBruto, double horaExtra) {
        this.salarioBruto = salarioBruto;
        this.horaExtra = horaExtra;
    }

    // Método de Validação
    public void  executarValidacao(){
       Validacao validacao = new Validacao(salarioBruto);
       boolean resultadoValidacao = validacao.validacaoSalario(salarioBruto);
       Scanner ler = new Scanner(System.in);

       while (!resultadoValidacao) {
           System.out.println("Salário inválido. Por favor, insira um valor entre R$500,OO á R$30.000,00.");

           // Criação do Objeto Scanner
           System.out.println("\nInsira novomente seu salário");
           this.salarioBruto = ler.nextDouble();

           resultadoValidacao = validacao.validacaoSalario(this.salarioBruto);
       }
    }
}
