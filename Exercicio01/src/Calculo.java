public class Calculo {
//    public Calculo(String nomeAluno, double nota1, double nota2, double peso1, double peso2) {
//        super(nomeAluno, nota1, nota2, peso1, peso2);
//    }
    
    // Criação de Atributos
    double nota1;
    double nota2;
    double peso1;
    double peso2;
    // Criação de um atributo do tipo Objeto da Classe de Entrada e Saida
    EntradaSaida entradaSaida;

    // Método Construtor
    public Calculo(EntradaSaida entradaSaida) {
        this.entradaSaida = entradaSaida;
        this.nota1=entradaSaida.nota1;
        this.nota2= entradaSaida.nota2;
        this.peso1=entradaSaida.peso1;
        this.peso2= entradaSaida.peso2;
    }

    // Métodos de Calculos
    // Calculo da Média
    double calcularMedia(double nota1, double nota2) {
        return (this.nota1 + nota2) / 2;
    }
    // Calculo da Média Ponderada
    double calcularMediaPonderada(double nota1, double nota2, double peso1, double peso2) {
        return (nota1 * peso1) + (nota2 * peso2) / (peso1 + peso2);
    }
}