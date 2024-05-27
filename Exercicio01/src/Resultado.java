
public class Resultado  {
    // Criação de Atributos
    String nomeAluno;
    double nota1;
    double nota2;
    double peso1;
    double peso2;
    EntradaSaida entradaSaida;
    Calculo calculo;


    // Método construtor
    // receb nos atributos de resultado os atributos do objeto entrada e saida
    public Resultado(EntradaSaida entradaSaida) {
        this.entradaSaida = entradaSaida;
        this.nomeAluno= entradaSaida.nomeAluno;
        this.nota1=entradaSaida.nota1;
        this.nota2= entradaSaida.nota2;
        this.peso1=entradaSaida.peso1;
        this.peso2= entradaSaida.peso2;
    }

    // Criação de um Método para Inicializar o Objeto de Caculo
    void setCalculo(){
        // instacimento do objeto
         calculo  = new Calculo(entradaSaida);
    }


    //Método de Aprovação
    void validacaoDeMedia() {
        // chama o objeto de calculo
        setCalculo();
        if (calculo.calcularMedia(nota1, nota2) >= 7) {
            System.out.println("\nO aluno " + nomeAluno + " está aprovado");
        } else {
            System.out.println("\nO aluno " + nomeAluno + " está reprovado");
        }
    }
    void validacaoDeMediaPonderada() {
        setCalculo();
        if (calculo.calcularMediaPonderada(nota1, nota2, peso1, peso2) >= 7) {
            System.out.println("\nO aluno " + nomeAluno + " está aprovado");
        } else {
            System.out.println("\nO aluno " + nomeAluno + " está reprovado");
        }
    }
}