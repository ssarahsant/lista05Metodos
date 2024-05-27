import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de Variaveis
        String nome;
        double salarioBruto, horaExtra;

        // Criação do Objeto Scanner
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá Colaborador, seja bem-vindo(a) a folha de pagamento");

        System.out.println("\nPara começar insira seu nome completo");
        nome = ler.nextLine();

        System.out.println("\nInsira o valor de seu Salário Bruto (usando virgula para as casas decimais)");
        salarioBruto = ler.nextDouble();

        System.out.println("\nInsira a quantidade de horas extras realizadas nesse mês");
        horaExtra = ler.nextDouble();

        EntradaSaida entradaSaida = new EntradaSaida(salarioBruto, horaExtra);
        entradaSaida.executarValidacao();
        
        Calculo calculo = new Calculo(entradaSaida);

        System.out.print(calculo.CalcularHoraExtra());

        System.out.printf("\n%s, seu salário líquido é de R$%.2f", nome, calculo.CalcularSalarioLiquido());
    }
}