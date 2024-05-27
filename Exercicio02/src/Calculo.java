public class Calculo {
    // Atributos
    double salarioBruto;
    double horaExtra;
    EntradaSaida entradaSaida;

    // Método Construtor
    public Calculo(EntradaSaida entradaSaida) {
        this.entradaSaida = entradaSaida;
        this.salarioBruto = entradaSaida.salarioBruto;
        this.horaExtra = entradaSaida.horaExtra;
    }

    // Método de Calculos
    double CalcularINSS() {
        return (salarioBruto * (20.00 / 100.00));
    }

    double CalcularIRPF()  {
        return (salarioBruto * (10.00 / 100.00));
    }

    double CalcularPlanoSaude() {
        return (salarioBruto * (5.00 / 100.00));
    }

    double CalcularHoraExtra() {
        return (salarioBruto / 160 + ((salarioBruto / 160) * (50.00 / 100.00))) * horaExtra;
    }

    double CalcularSalarioLiquido() {
        return (salarioBruto - (CalcularINSS() + CalcularIRPF() +
                CalcularPlanoSaude()) + CalcularHoraExtra());
    }
}