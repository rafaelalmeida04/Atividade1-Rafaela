package equipe;

public class CalcDivisao {

    // Pessoa D
    public double divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return (double) a / b;
    }
}
