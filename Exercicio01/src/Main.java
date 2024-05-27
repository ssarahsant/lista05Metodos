import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de Variveis[
        String nomeAluno;
        int tipoMedia;
        double nota1, nota2, peso1, peso2;

        // Criação do Objeto Scanner
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá professor seja bem vindo, calcule as médias do seu aluno");

        //Inserção de Dados
        System.out.println("\nInsira o nome do aluno");
        nomeAluno = ler.next();

        System.out.println("\nMAIN Insira a primeira nota do aluno");
        nota1 = ler.nextDouble();

        System.out.println("\nMAIN Insira a segunda nota do aluno");
        nota2 = ler.nextDouble();

        System.out.println("Insira o número conforme a operação desejada" +
                "\n1. Média Aritimetica" +
                "\n2. Média Ponderada");
        tipoMedia = ler.nextInt();
        switch (tipoMedia){
            case 1 -> {
                // Instanciomento do Objeto de Entrada e Saída
                EntradaSaida entradaSaida = new EntradaSaida(nomeAluno, nota1, nota2);
                // metodo que faza validação das notas inseridas
                entradaSaida.executar();

                // Instanciomento do Objeto Resultado
                // passa como parametro o objeto para recuperar o valor dos atributos
                Resultado resultado = new Resultado(entradaSaida);

                // Utilização do Objeto
                resultado.validacaoDeMedia();
            }
            case 2 -> {
                System.out.println("\nInsira o primeiro peso");
                peso1 = ler.nextDouble();

                System.out.println("\nInsira o segundo peso");
                peso2 = ler.nextDouble();

                // Instanciomento do Objeto de Entrada e Saída
                EntradaSaida entradaSaida = new EntradaSaida(nomeAluno, nota1, nota2, peso1, peso2);
                // metodo que faza validação das notas inseridas
                entradaSaida.executar();

                // Instanciomento do Objeto Resultado
                // passa como parametro o objeto para recuperar o valor dos atributos
                Resultado resultado = new Resultado(entradaSaida);

                // Utilização do Objeto
                resultado.validacaoDeMediaPonderada();
            }
        }

        // Fechamento do Objeto Scanner
        ler.close();

        // Fechando o Programa
        System.exit(0);
    }
}