import java.util.Scanner;

public class EntradaSaida {
    // Criação de Atributos
    String nomeAluno;
    double nota1;
    double nota2;
    double peso1;
    double peso2;


    // Método Construtor
    public EntradaSaida(String nomeAluno, double nota1, double nota2) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // método de validação
    public void executar(){
        Validacao validacao = new Validacao(nota1, nota2);
        boolean resultadoValidacao = validacao.validacaoDeNotas(nota1, nota2);
        Scanner ler = new Scanner(System.in);

        while (!resultadoValidacao){
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");

            // Criação do Objeto Scanner
            System.out.println("\nES Insira a primeira nota do aluno");
            this.nota1 = ler.nextDouble();

            System.out.println("\nES Insira a segunda nota do aluno");
            this.nota2 = ler.nextDouble();

            resultadoValidacao = validacao.validacaoDeNotas(this.nota1, this.nota2);
        }

    }
    public EntradaSaida(double peso1, double peso2) {
        this.peso1 = peso1;
        this.peso2 = peso2;
    }
    public EntradaSaida(double nota1, double nota2, double peso1, double peso2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.peso1 = peso1;
        this.peso2 = peso2;
    }
    public EntradaSaida(String nomeAluno, double nota1, double nota2, double peso1, double peso2) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.peso1 = peso1;
        this.peso2 = peso2;
    }


}