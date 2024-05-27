public class Validacao {
    public Validacao(double nota1, double nota2) {

    }

    // Método de Validação
    boolean validacaoDeNotas(double nota1, double nota2) {

        return (nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10);
    }
}